
-- Exercise 1: Control Structures

--  Scenario 1: Apply 1% discount to loan interest for customers over 60
BEGIN
    FOR cust IN (SELECT CustomerID, DOB FROM Customers) LOOP
        IF MONTHS_BETWEEN(SYSDATE, cust.DOB)/12 > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;
        END IF;
    END LOOP;
END;
/

-- Scenario 2: Set IsVIP flag (assume IsVIP column exists)
ALTER TABLE Customers ADD IsVIP CHAR(1);

BEGIN
    FOR cust IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = cust.CustomerID;
        END IF;
    END LOOP;
END;
/

--  Scenario 3: Send reminders for loans due within 30 days
BEGIN
    FOR loan IN (
        SELECT l.LoanID, c.Name, l.EndDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || loan.LoanID || ' for customer ' || loan.Name ||
                             ' is due on ' || TO_CHAR(loan.EndDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/
