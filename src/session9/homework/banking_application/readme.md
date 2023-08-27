Simple Banking Application -- Construct a banking system that lets account holders:

- Create an account with personal details and an initial deposit.
- Deposit and withdraw money from their account.
- Check their current balance.
- View a summary of their recent transactions, including deposits, withdrawals, and balance after each transaction.

Explanation

- created class Transaction with fields for transactionDateTime as LocalDateTime, transactionID as UUID, transaction
  amount as double, transactionType as enum(Withdraw, Deposit) and transactionStatus as enum(Pending, Processed,
  Denied).
- method toString was overloaded.
- constructor initializes object by receiving an double as transactionAmount and an enum with the TransactionType (
  withdraw, deposit). TransactionDateTime is set to LocalDateTime.now(), a unique UUID is generated and
  transactionStatus is set de PENDING.
- Implemented getters for all fields. Implemented setter for transactionStatus.
- created class BankAccount with fields for account owner firstName and lastName as Strings, accountID as UUID, balance
  as double and a List of type Transactions.
- public method processTransaction receives as parameters an double amount and an enum TransactionType. It checks the
  TransactionType and calls either of the private methods deposit or withdraw.
- the private methods deposit and withdraw initialize a new Transaction then check if conditions are met for transaction
  to be processed. If they are they update the balance, set transaction status to PROCESSED and add it to the list of
  transactions. If transaction cannot be processed (not enough money in account, or amount specified is negative) then
  the balance does not get updated, the transaction status is set to DENIED and added to the list of transactions on the
  bank account.
- In order to get the recent transactions 3 overloaded methods exist. One receives two LocalDateTime objects called
  start and end and returns a list of all transactions between those datetimes(exclusive). One receives a single
  LocalDateTime Object and returns all the transactions that happened after that moment. The third receives an int
  number and returns the last number of transactions (if the amount of transactions requested is at least equal to
  amount of transactions stored on account.)
- In order to see the balance of an account, a getter for balance was implemented.