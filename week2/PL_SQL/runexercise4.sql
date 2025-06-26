DECLARE
    v_has_funds BOOLEAN;
BEGIN
    v_has_funds := HasSufficientBalance(1, 500);
    IF v_has_funds THEN
        DBMS_OUTPUT.PUT_LINE('Transaction allowed.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance.');
    END IF;
END;
/
