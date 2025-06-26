-- Exercise 4: Functions


--  Scenario 1: CalculateAge
-- Returns the age of a customer based on DOB
CREATE OR REPLACE FUNCTION CalculateAge (
    p_dob IN DATE
) RETURN NUMBER IS
    v_age NUMBER;
BEGIN
    v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, p_dob) / 12);
    RETURN v_age;
END;
/

--  Scenario 2: CalculateMonthlyInstallment
-- Returns EMI using loan amount, interest rate, and duration in years
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
    p_loan_amount     IN NUMBER,
    p_annual_rate     IN NUMBER,
    p_duration_years  IN NUMBER
) RETURN NUMBER IS
    v_monthly_rate  NUMBER := p_annual_rate / (12 * 100); -- convert annual % to monthly decimal
    v_months        NUMBER := p_duration_years * 12;
    v_emi           NUMBER;
BEGIN
    IF v_monthly_rate = 0 THEN
        v_emi := p_loan_amount / v_months;
    ELSE
        v_emi := p_loan_amount * v_monthly_rate * POWER((1 + v_monthly_rate), v_months) /
                 (POWER((1 + v_monthly_rate), v_months) - 1);
    END IF;

    RETURN ROUND(v_emi, 2);
END;
/

--  Scenario 3: HasSufficientBalance
-- Returns TRUE if account has at least the given amount
CREATE OR REPLACE FUNCTION HasSufficientBalance (
    p_account_id IN NUMBER,
    p_amount     IN NUMBER
) RETURN BOOLEAN IS
    v_balance NUMBER;
BEGIN
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_account_id;

    RETURN v_balance >= p_amount;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN FALSE;
    WHEN OTHERS THEN
        RETURN FALSE;
END;
/
