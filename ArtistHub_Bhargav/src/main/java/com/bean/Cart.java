package com.bean;

public class Cart {
		private int cid, uid, bid, book_price, book_qty, total_price;
		private String payment_status;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public int getBook_price() {
			return book_price;
		}
		public void setBook_price(int book_price) {
			this.book_price = book_price;
		}
		public int getBook_qty() {
			return book_qty;
		}
		public void setBook_qty(int book_qty) {
			this.book_qty = book_qty;
		}
		public int getTotal_price() {
			return total_price;
		}
		public void setTotal_price(int total_price) {
			this.total_price = total_price;
		}
		public String getPayment_status() {
			return payment_status;
		}
		public void setPayment_status(String payment_status) {
			this.payment_status = payment_status;
		}
		
		
}
