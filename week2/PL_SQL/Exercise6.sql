
-- Exercise 6: Cursors


--  Scenario 1: GenerateMonthlyStatements
-- Print all transactions for the current month, grouped by customer
DECLARE
    CURSOR trans_cursor IS
        SELECT c.CustomerID, c.Name, t.TransactionDate, t.Amount, t.TransactionType
        FROM Customers c
        JOIN Accounts a ON c.CustomerID = a.CustomerID
        JOIN Transactions t ON a.AccountID = t.AccountID
        WHERE EXTRACT(MONTH FROM t.TransactionDate) = EXTRACT(MONTH FROM SYSDATE)
          AND EXTRACT(YEAR FROM t.TransactionDate) = EXTRACT(YEAR FROM SYSDATE)
        ORDER BY c.CustomerID, t.TransactionDate;

    v_customer_id     Customers.CustomerID%TYPE;
    v_name            Customers.Name%TYPE;
    v_date            Transactions.TransactionDate%TYPE;
    v_amount          Transactions.Amount%TYPE;
    v_type            Transactions.TransactionType%TYPE;
BEGIN
    DBMS_OUTPUT.PUT_LINE('Monthly Statements for ' || TO_CHAR(SYSDATE, 'Month YYYY'));

    OPEN trans_cursor;
    LOOP
        FETCH trans_cursor INTO v_customer_id, v_name, v_date, v_amount, v_type;
        EXIT WHEN trans_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('Customer: ' || v_name || ' | Date: ' || TO_CHAR(v_date, 'DD-MON-YYYY') ||
                             ' | Type: ' || v_type || ' | Amount: ' || v_amount);
    END LOOP;
    CLOSE trans_cursor;
END;
/

--  Scenario 2: ApplyAnnualFee
-- Deduct fixed fee (e.g., ₹100) from every account
DECLARE
    CURSOR account_cursor IS
        SELECT AccountID, Balance FROM Accounts;

    v_account_id Accounts.AccountID%TYPE;
    v_balance    Accounts.Balance%TYPE;
    v_fee CONSTANT NUMBER := 100;
BEGIN
    OPEN account_cursor;
    LOOP
        FETCH account_cursor INTO v_account_id, v_balance;
        EXIT WHEN account_cursor%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - v_fee,
            LastModified = SYSDATE
        WHERE AccountID = v_account_id;

        DBMS_OUTPUT.PUT_LINE('Annual fee of ₹' || v_fee || ' applied to Account ID: ' || v_account_id);
    END LOOP;
    CLOSE account_cursor;

    COMMIT;
END;
/

--  Scenario 3: UpdateLoanInterestRates
-- Increase interest rate by 0.5% for all loans
DECLARE
    CURSOR loan_cursor IS
        SELECT LoanID, InterestRate FROM Loans;

    v_loan_id     Loans.LoanID%TYPE;
    v_old_rate    Loans.InterestRate%TYPE;
    v_new_rate    NUMBER;
BEGIN
    OPEN loan_cursor;
    LOOP
        FETCH loan_cursor INTO v_loan_id, v_old_rate;
        EXIT WHEN loan_cursor%NOTFOUND;

        v_new_rate := v_old_rate + 0.5;

        UPDATE Loans
        SET InterestRate = v_new_rate
        WHERE LoanID = v_loan_id;

        DBMS_OUTPUT.PUT_LINE('Loan ID ' || v_loan_id || ' interest updated from ' ||
                             v_old_rate || '% to ' || v_new_rate || '%');
    END LOOP;
    CLOSE loan_cursor;

    COMMIT;
END;
/
