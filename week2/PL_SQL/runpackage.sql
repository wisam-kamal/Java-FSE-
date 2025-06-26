EXEC CustomerManagement.AddCustomer(3, 'Tim Cook', TO_DATE('1960-11-01', 'YYYY-MM-DD'), 2000);

SELECT CustomerManagement.GetCustomerBalance(3) FROM dual;

EXEC AccountOperations.CloseAccount(2);
