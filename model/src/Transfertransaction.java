
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
class Transfertransaction {
      private LocalDate date;
  private String description;
  private int amount;
  private int total;

  public LocalDate getDate() {
      return date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String Decription) {
      this.description = description;
   }
   
   public int getAmount() {
      return (int) amount;
   }

   public void setAmount(int amount) {
      this.amount = amount;
   }

   public int getTotal() {
      return total;
   }

   public void settotal(int total) {
      this.total = total;
   }
}
