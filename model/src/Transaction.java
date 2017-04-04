
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moj5194
 */
public class Transaction {
private long id;
private LocalDate date;
private DepositTransaction DepositTransaction;
private WithdrawTranaction WithdrawTranaction;
private Transfertransaction Transfertransaction;
private long amount;


   public long getUId() {
      return id;
   }

   public void setUId(long Userid) {
      this.id = id;
   }
   
   public long getAccountID() {
      return id;
   }

   public void setAccountID(long Accountid) {
      this.id = id;
   }

   public LocalDate getDate() {
      return date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }
   
  public long getAmount() {
    long amount = 0;
      return amount;
   }

   public void setAmount(long amount) {
      this.amount = amount;
   }

   public DepositTransaction getDepositTransaction() {
    DepositTransaction DepositTransaction = null;
      return DepositTransaction;
   }

   public void setDepositTransaction(DepositTransaction DepositTransaction) {
      this.DepositTransaction = DepositTransaction;
   }
   
   public WithdrawTranaction getWithdrawTranaction() {
    WithdrawTranaction WithdrawTranaction = null;
      return WithdrawTranaction;
   }

   public void setWithdrawTranaction(WithdrawTranaction WithdrawTranaction) {
      this.WithdrawTranaction = WithdrawTranaction;
   }
   
    public Transfertransaction getTransfertransaction() {
    Transfertransaction Transfertransaction = null;
      return Transfertransaction;
   }

   public void setTransfertransaction(Transfertransaction Transfertransaction) {
      this.Transfertransaction = Transfertransaction;
   }

}
