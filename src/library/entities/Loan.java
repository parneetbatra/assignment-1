package library.entities;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

// Author: Parneet Singh
// Reviewer: Tawan Chotikanchinda, Aatish Rajkarnikar, Chandrika Katikam

@SuppressWarnings("serial")
public class Loan implements Serializable {
	
	// public static enum lOaN_sTaTe { CURRENT, OVER_DUE, DISCHARGED };
	public static enum LOAN_STATE { CURRENT, OVER_DUE, DISCHARGED }; // lOaN_sTaTe change to LOAN_STATE
	
	// private int LoAn_Id;
	private int loanId; // LoAn_Id change to loanId
	// private Book BoOk;
	private Book book; // BoOk change to book
	// private Member MeMbEr;
	private Member member; // MeMbEr change to member
	// private Date DaTe;
	private Date date; // DaTe change date
	// private lOaN_sTaTe StAtE;
	private LOAN_STATE state; // lOaN_sTaTe change to LOAN_STATE, StAtE change to state

	// public Loan(int loanId, Book bOoK, Member mEmBeR, Date DuE_dAtE) {
	public Loan(int loanId, Book book, Member member, Date dueDate) { // bOoK change to book, mEmBeR change to member, DuE_dAtE change to dueDate
		// this.LoAn_Id = loanId;
		this.loanId = loanId; // LoAn_Id change to loanId
		// this.BoOk = bOoK;
		this.book = book; // BoOk change to book, bOoK change to book
		// this.MeMbEr = member;
		this.member = member; // MeMbEr change to member, mEmBeR change to member
		// this.DaTe = dueDate;
		this.date = dueDate; // DaTe change to date, DuE_dAtE change to dueDate
		// this.StAtE = lOaN_sTaTe.CURRENT;
		this.state = LOAN_STATE.CURRENT; // StAtE change to state, lOaN_sTaTe change to LOAN_STATE
	}

	// public void cHeCk_OvEr_DuE() {
	public void checkOverDue() { // cHeCk_OvEr_DuE change to checkOverDue
		// if (StAtE == lOaN_sTaTe.CURRENT && Calendar.gEtInStAnCe().gEt_DaTe().after(DaTe)) 
		if (state == LOAN_STATE.CURRENT && Calendar.getInstance().getDate().after(date)) { // StAtE change to state, lOaN_sTaTe change to LOAN_STATE, gEtInStAnCe change to getInstance, gEt_DaTe change to getDate, DaTe change to date
			// this.StAtE = lOaN_sTaTe.OVER_DUE;
            		this.state = LOAN_STATE.OVER_DUE; // StAtE change to state, lOaN_sTaTe change to LOAN_STATE
        	}
	}

	// public boolean Is_OvEr_DuE() {
	public boolean isOverDue() { // Is_OvEr_DuE change to isOverDue
		// return StAtE == lOaN_sTaTe.OVER_DUE;
		return state == LOAN_STATE.OVER_DUE; // StAtE change to state, lOaN_sTaTe change to LOAN_STATE
	}

	// public Integer GeT_Id() {
	public Integer getId() { // GeT_Id change to getId
		// return LoAn_Id;
		return loanId; // LoAn_Id change to loanId
	}

	// public Date GeT_DuE_DaTe() {
	public Date GeT_DuE_DaTe() { // GeT_DuE_DaTe change to getDueDate
		// return DaTe;
		return date; // DaTe change to date
	}
	
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		StringBuilder sb = new StringBuilder();
		// sb.append("Loan:  ").append(LoAn_Id).append("\n")
		sb.append("Loan:  ").append(loanId).append("\n") // LoAn_Id change to loanId
		//   .append("  Borrower ").append(MeMbEr.GeT_ID()).append(" : ")
		  .append("  Borrower ").append(member.getId()).append(" : ") // MeMbEr change to member, GeT_ID change to getId
		//   .append(MeMbEr.GeT_LaSt_NaMe()).append(", ").append(MeMbEr.GeT_FiRsT_NaMe()).append("\n")
		  .append(MeMbEr.getLastName()).append(", ").append(member.getFirstName()).append("\n") // MeMbEr change to member, GeT_LaSt_NaMe change to getLastName, GeT_FiRsT_NaMe change to getFirstName
		//   .append("  Book ").append(BoOk.gEtId()).append(" : " )
		  .append("  Book ").append(book.getId()).append(" : " ) // BoOk change to book, gEtId change to getId
		//   .append(BoOk.gEtTiTlE()).append("\n")
		  .append(book.getTitle()).append("\n") // BoOk change to book, gEtTiTlE change to getTitle
		//   .append("  DueDate: ").append(sdf.format(DaTe)).append("\n")
		  .append("  DueDate: ").append(sdf.format(date)).append("\n") // DaTe change to date
		//   .append("  State: ").append(StAtE);
		  .append("  State: ").append(state); // StAtE change to state
		return sb.toString();
	}

	// public Member GeT_MeMbEr() {
	public Member getMember() { // GeT_MeMbEr change to getMember
		// return MeMbEr;
		return member; // MeMbEr change to member
	}

        // public Book GeT_BoOk() { 
	public Book getBook() { // GeT_BoOk change to getBook
		// return BoOk;
		return book; // BoOk change to book
	}

	// public void DiScHaRgE() {
	public void discharge() { // DiScHaRgE change to discharge
		// StAtE = lOaN_sTaTe.DISCHARGED;
		state = LOAN_STATE.DISCHARGED; // StAtE change to state, lOaN_sTaTe change to LOAN_STATE
	}
}
