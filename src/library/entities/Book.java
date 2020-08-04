package library.entities;
import java.io.Serializable;

// Author: Parneet Singh

@SuppressWarnings("serial")
public class Book implements Serializable {
	
	// private String tItLe;
	private String title; // tItLe change to title
	// private String AuThOr;
	private String author; // AuThOr change to author
	// private String CALLNO;
	private String callNo; // CALLNO change to callNo
	// private int iD;
	private int id; // iD change to id
	
	// private enum sTaTe { AVAILABLE, ON_LOAN, DAMAGED, RESERVED };
	private enum State { AVAILABLE, ON_LOAN, DAMAGED, RESERVED }; // sTaTe change to State
	// private sTaTe StAtE;
	private State state; // sTaTe change to State, StAtE change to state
	
	
	public Book(String author, String title, String callNo, int id) {
		// this.AuThOr = author;
		this.author = author; // AuThOr change to author
		// this.tItLe = title;
		this.title = title; // tItLe change to title
		// this.CALLNO = callNo;
		this.callNo = callNo; // CALLNO change to callNo
		// this.iD = id;
		this.id = id; // iD change to id
		// this.StAtE = sTaTe.AVAILABLE;
		this.state = State.AVAILABLE; // StAtE change to state, sTaTe change to State
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// sb.append("Book: ").append(iD).append("\n")
		sb.append("Book: ").append(id).append("\n") // iD change to id
		  // .append("  Title:  ").append(tItLe).append("\n")
		  .append("  Title:  ").append(title).append("\n") // tItLe change to title
		  // .append("  Author: ").append(AuThOr).append("\n")
		  .append("  Author: ").append(author).append("\n") // AuThOr change to author
		  // .append("  CallNo: ").append(CALLNO).append("\n")
		  .append("  CallNo: ").append(callNo).append("\n") // CALLNO change to callNo
		  // .append("  State:  ").append(StAtE);
		  .append("  State:  ").append(state); // StAtE change to state
		
		return sb.toString();
	}

	// public Integer gEtId() {
	public Integer getId() { // gEtId change to getId
		// return iD;
		return id; // iD change to id
	}

	// public String gEtTiTlE() {
	public String getTitle() { // gEtTiTlE change to getTitle
		// return tItLe;
		return title; // tItLe change to title
	}
	
	// public boolean iS_AvAiLaBlE() {
	public boolean isAvailable() { // iS_AvAiLaBlE change to isAvailable
		// return StAtE == sTaTe.AVAILABLE;
		return state == State.AVAILABLE; // StAtE change to state, sTaTe change to State
	}

	// public boolean iS_On_LoAn() {
	public boolean isOnLoan() { // iS_On_LoAn change to isOnLoan
		// return StAtE == sTaTe.ON_LOAN;
		return state == State.ON_LOAN; // StAtE change to state, sTaTe change to State
	}

	// public boolean iS_DaMaGeD() {
	public boolean isDemaged() { // iS_DaMaGeD change to isDemaged
		// return StAtE == sTaTe.DAMAGED;
		return state == State.DAMAGED; // StAtE change to state, sTaTe change to State
	}

	// public void BoRrOw() {
	public void borrow() { // BoRrOw change to borrow
		// if (StAtE.equals(sTaTe.AVAILABLE)) 
		if (state.equals(State.AVAILABLE)) {  // StAtE change to state, sTaTe change to State
			// StAtE = sTaTe.ON_LOAN;
			state = State.ON_LOAN; // StAtE change to state, sTaTe change to State
		}
		else {
			// throw new RuntimeException(String.format("Book: cannot borrow while book is in state: %s", StAtE));
			throw new RuntimeException(String.format("Book: cannot borrow while book is in state: %s", state));  // StAtE change to state
		}		
	}

	// public void ReTuRn(boolean DaMaGeD) {
	public void return(boolean demaged) { // ReTuRn change to return, DaMaGeD change to demaged
		// if (StAtE.equals(sTaTe.ON_LOAN)) 
		if (state.equals(State.ON_LOAN))  // StAtE change to state, sTaTe change to State
			// if (DaMaGeD) 
			if (demaged) { // DaMaGeD change to demaged
				// StAtE = sTaTe.DAMAGED;
				state = State.DAMAGED; // StAtE change to state, sTaTe change to State
			}
			else {
				// StAtE = sTaTe.AVAILABLE;
				state = State.AVAILABLE; // StAtE change to state, sTaTe change to State
			}
		
		else {
			// throw new RuntimeException(String.format("Book: cannot Return while book is in state: %s", StAtE));
			throw new RuntimeException(String.format("Book: cannot Return while book is in state: %s", state));  // StAtE change to state
		}	
	}

	// public void RePaIr() {
	public void repair() { // RePaIr change to repair
		// if (StAtE.equals(sTaTe.DAMAGED)) 
		if (state.equals(State.DAMAGED)) { // StAtE change to state, sTaTe change to State
			// StAtE = sTaTe.AVAILABLE;
			state = State.AVAILABLE; // StAtE change to state, sTaTe change to State
		}
		else {
			// throw new RuntimeException(String.format("Book: cannot repair while book is in state: %s", StAtE));
			throw new RuntimeException(String.format("Book: cannot repair while book is in state: %s", state));  // StAtE change to state
		}
	}
}
