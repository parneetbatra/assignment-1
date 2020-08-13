package library.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Author: Parneet Singh

@SuppressWarnings("serial")
public class Member implements Serializable {

	// private String LaSt_NaMe;
	private String lastName; // LaSt_NaMe change to lastName
	// private String FiRsT_NaMe;
	private String firstName; // FiRsT_NaMe change to firstName
	// private String EmAiL_AdDrEsS;
	private String emailAddress; // EmAiL_AdDrEsS change to emailAddress
	// private int PhOnE_NuMbEr;
	private int phoneNumber; // PhOnE_NuMbEr change to phoneNumber
	// private int MeMbEr_Id;
	private int memberId; // MeMbEr_Id change to memberId
	// private double FiNeS_OwInG;
	private double finesOwing; // FiNeS_OwInG change to finesOwing
	
	// private Map<Integer, Loan> cUrReNt_lOaNs;
	private Map<Integer, Loan> currentLoans; // cUrReNt_lOaNs change to currentLoans

	
	// public Member(String lAsT_nAmE, String fIrSt_nAmE, String eMaIl_aDdReSs, int pHoNe_nUmBeR, int mEmBeR_iD) {
	public Member(String lastName, String firstName, String emailAddress, int phoneNumber, int memberId) { // lAsT_nAmE change lastName, fIrSt_nAmE change to firstName, eMaIl_aDdReSs change to emailAddress, pHoNe_nUmBeR change to phoneNumber, mEmBeR_iD change to memberId
		// this.LaSt_NaMe = lAsT_nAmE;
		this.lastName = lastName; // LaSt_NaMe change to lastName, lAsT_nAmE change to lastName
		// this.FiRsT_NaMe = fIrSt_nAmE;
		this.firstName = firstName; // FiRsT_NaMe change to firstName, fIrSt_nAmE change to firstName
		// this.EmAiL_AdDrEsS = eMaIl_aDdReSs;
		this.emailAddress = emailAddress; // EmAiL_AdDrEsS change to emailAddress, eMaIl_aDdReSs change to emailAddress
		// this.PhOnE_NuMbEr = pHoNe_nUmBeR;
		this.phoneNumber = phoneNumber; // PhOnE_NuMbEr change to phoneNumber, pHoNe_nUmBeR change to phoneNumber
		// this.MeMbEr_Id = mEmBeR_iD;
		this.memberId = memberId; // MeMbEr_Id change to memberId, mEmBeR_iD change to memberId
		
		// this.cUrReNt_lOaNs = new HashMap<>();
		this.currentLoans = new HashMap<>(); // cUrReNt_lOaNs change to currentLoans
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		// sb.append("Member:  ").append(MeMbEr_Id).append("\n")
		sb.append("Member:  ").append(memberId).append("\n") // MeMbEr_Id change to memberId
		//   .append("  Name:  ").append(LaSt_NaMe).append(", ").append(FiRsT_NaMe).append("\n")
		  .append("  Name:  ").append(lastName).append(", ").append(firstName).append("\n") // LaSt_NaMe change to lastName, FiRsT_NaMe change to firstName
		//   .append("  Email: ").append(EmAiL_AdDrEsS).append("\n")
		  .append("  Email: ").append(emailAddress).append("\n") // EmAiL_AdDrEsS change to emailAddress
		//   .append("  Phone: ").append(PhOnE_NuMbEr)
		  .append("  Phone: ").append(phoneNumber) // PhOnE_NuMbEr change to phoneNumber
		  .append("\n")
		//   .append(String.format("  Fines Owed :  $%.2f", FiNeS_OwInG))
		  .append(String.format("  Fines Owed :  $%.2f", finesOwing)) // FiNeS_OwInG change to finesOwing
		  .append("\n");
		
		// for (Loan LoAn : cUrReNt_lOaNs.values()) {
		for (Loan loan : currentLoans.values()) { // LoAn change to loan, cUrReNt_lOaNs change to currentLoans
			// sb.append(LoAn).append("\n");
			sb.append(loan).append("\n"); // LoAn change to loan
		}		  
		return sb.toString();
	}

	// public int GeT_ID() {
	public int getId() { // GeT_ID change to getId
		// return MeMbEr_Id;
		return memberId; // MeMbEr_Id change to memberId
	}
	
	// public List<Loan> GeT_LoAnS() {
	public List<Loan> getLoans() { // GeT_LoAnS change to getLoans
		// return new ArrayList<Loan>(cUrReNt_lOaNs.values());
		return new ArrayList<Loan>(currentLoans.values()); // cUrReNt_lOaNs change to currentLoans
	}
	
	// public int gEt_nUmBeR_Of_CuRrEnT_LoAnS() {
	public int getNumberOfCurrentLoans() { // gEt_nUmBeR_Of_CuRrEnT_LoAnS change to getNumberOfCurrentLoans
		// return cUrReNt_lOaNs.size();
		return currentLoans.size(); // cUrReNt_lOaNs change to currentLoans
	}
	
	// public double FiNeS_OwEd() {
	public double getFineOwing() { // FiNeS_OwEd change to getFineOwing
		// return FiNeS_OwInG;
		return finesOwing; // FiNeS_OwInG change to finesOwing
	}
	
	// public void TaKe_OuT_LoAn(Loan lOaN) {
	public void takeOutLoan(Loan loan) { // TaKe_OuT_LoAn change to takeOutLoan, lOaN change to loan
		// if (!cUrReNt_lOaNs.containsKey(lOaN.GeT_Id())) 
		if (!currentLoans.containsKey(loan.getId())) { // cUrReNt_lOaNs change to currentLoans, LoAn change to loan, GeT_ID change to getId
			// cUrReNt_lOaNs.put(lOaN.GeT_Id(), lOaN);
			currentLoans.put(loan.getId(), loan); // cUrReNt_lOaNs change to currentLoans, LoAn change to loan, GeT_ID change to getId
		}
		else {
			throw new RuntimeException("Duplicate loan added to member");
		}
	}
	
	// public String GeT_LaSt_NaMe() {
	public String getLastName() { // GeT_LaSt_NaMe change to getLastName
		// return LaSt_NaMe;
		return lastName; // LaSt_NaMe change to lastName
	}
	
	// public String GeT_FiRsT_NaMe() {
	public String getFirstName() { // GeT_FiRsT_NaMe change to getFirstName
		// return FiRsT_NaMe;
		return firstName; // FiRsT_NaMe change to firstName
	}

	// public void AdD_FiNe(double fine) {
	public void addFine(double fine) { // AdD_FiNe change to addFine
		// FiNeS_OwInG += fine;
		finesOwing += fine; // FiNeS_OwInG change to finesOwing
	}
	
	// public double PaY_FiNe(double AmOuNt) {
	public double payFine(double amount) { // PaY_FiNe change to payFine, AmOuNt change to amount
		// if (AmOuNt < 0) 
		if (amount < 0) { // AmOuNt change to amount
			throw new RuntimeException("Member.payFine: amount must be positive");
		}
		double change = 0;
		// if (AmOuNt > FiNeS_OwInG) {
		if (amount > finesOwing) { // AmOuNt change to amount, FiNeS_OwInG change to finesOwing
			// change = AmOuNt - FiNeS_OwInG;
			change = amount - finesOwing; // AmOuNt change to amount, FiNeS_OwInG change to finesOwing
			// FiNeS_OwInG = 0;
			finesOwing = 0; // FiNeS_OwInG change to finesOwing
		}
		else {
			// FiNeS_OwInG -= AmOuNt;
			finesOwing -= amount; // FiNeS_OwInG change to finesOwing, AmOuNt change to amount
		}
		return change;
	}

	// public void dIsChArGeLoAn(Loan LoAn) {
	public void disChargeLoan(Loan loan) { // dIsChArGeLoAn change to disChargeLoan, LoAn change to loan
		// if (cUrReNt_lOaNs.containsKey(LoAn.GeT_Id())) 
		if (currentLoans.containsKey(loan.getId())) {  // cUrReNt_lOaNs change to currentLoans, LoAn change to loan, GeT_ID change to getId
			// cUrReNt_lOaNs.remove(LoAn.GeT_Id());
			currentLoans.remove(loan.getId()); // cUrReNt_lOaNs change to currentLoans, LoAn change to loan, GeT_ID change to getId
		}
		else {
			throw new RuntimeException("No such loan held by member");
		}
	}
}
