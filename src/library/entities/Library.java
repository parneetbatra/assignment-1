package library.entities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Author: Parneet Singh

@SuppressWarnings("serial")
public class Library implements Serializable {
	
    // private static final String lIbRaRyFiLe = "library.obj";
    private static final String LIBRARY_FILE = "library.obj"; // lIbRaRyFiLe change to LIBRARY_FILE
    // private static final int lOaNlImIt = 2;
    private static final int LOAN_LIMIT = 2; // lOaNlImIt change to LOAN_LIMIT
    // private static final int loanPeriod = 2;
    private static final int LOAN_PERIOD = 2; // loanPeriod change to LOAN_PERIOD 
    // private static final double FiNe_PeR_DaY = 1.0;
    private static final double FINE_PER_DAY = 1.0; // FiNe_PeR_DaY change to FINE_PER_DAY
    // private static final double maxFinesOwed = 1.0;
    private static final double MAX_FINES_OWED = 1.0; // maxFinesOwed change to MAX_FINES_OWED
    // private static final double damageFee = 2.0;
    private static final double DAMAGE_FEE = 2.0; // damageFee change to DAMAGE_FEE
	
    // private static Library SeLf;
    private static Library SELF; // SeLf change to SELF
    // private int bOoK_Id;
    private int bookId; // bOoK_Id change to bookId
    // private int mEmBeR_Id;
    private int memberId; // mEmBeR_Id change to memberId
    // private int lOaN_Id;
    private int lOaN_Id; // lOaN_Id change tp loanId
    // private Date lOaN_DaTe;
    private Date lOaN_DaTe; // lOaN_DaTe change to loanDate
	
	// private Map<Integer, Book> CaTaLoG;
	private Map<Integer, Book> CaTaLoG; // CaTaLoG change to catalog
	// private Map<Integer, Member> MeMbErS;
	private Map<Integer, Member> MeMbErS; // MeMbErS change to members
	// private Map<Integer, Loan> LoAnS;
	private Map<Integer, Loan> LoAnS; // LoAnS change to loans
	// private Map<Integer, Loan> CuRrEnT_LoAnS;
	private Map<Integer, Loan> CuRrEnT_LoAnS; // CuRrEnT_LoAnS change to currentLoans
	// private Map<Integer, Book> DaMaGeD_BoOkS;
	private Map<Integer, Book> DaMaGeD_BoOkS; // DaMaGeD_BoOkS change to damagedBooks
	

	private Library() {
		// CaTaLoG = new HashMap<>();
		catalog = new HashMap<>(); // CaTaLoG change to catalog
		// MeMbErS = new HashMap<>();
		members = new HashMap<>(); // MeMbErS change to members
		// LoAnS = new HashMap<>();
		loans = new HashMap<>(); // LoAnS change to loans
		// CuRrEnT_LoAnS = new HashMap<>();
		currentLoans = new HashMap<>(); // CuRrEnT_LoAnS change to currentLoans
		// DaMaGeD_BoOkS = new HashMap<>();
		damagedBooks = new HashMap<>(); // DaMaGeD_BoOkS change to damagedBooks
		// bOoK_Id = 1;
		bookId = 1; // bOoK_Id change to bookId
		// mEmBeR_Id = 1;
		memberId = 1; // mEmBeR_Id change to memberId
		// lOaN_Id = 1;		
		lOaN_Id = 1; // lOaN_Id change to loanId
	}

	// public static synchronized Library GeTiNsTaNcE() {	    
    public static synchronized Library getInstance() { // GeTiNsTaNcE change to getInstance
        // if (SeLf == null) {
        if (SELF == null) { // SeLf change to SELF
            // Path PATH = Paths.get(lIbRaRyFiLe);
            Path path = Paths.get(LIBRARY_FILE); // PATH change to path, lIbRaRyFiLe change to LIBRARY_FILE
            // if (Files.exists(PATH)) {
            if (Files.exists(PATH)) { // PATH change to path	
                // try (ObjectInputStream LiBrArY_FiLe = new ObjectInputStream(new FileInputStream(lIbRaRyFiLe));) {
                try (ObjectInputStream libraryFile = new ObjectInputStream(new FileInputStream(LIRARY_FILE));) { // LiBrArY_FiLe change tp libraryFile, lIbRaRyFiLe change to LIRARY_FILE
			    
                    // SeLf = (Library) LiBrArY_FiLe.readObject();
                    SeLf = (Library) libraryFile.readObject(); // SeLf change to SELF, LiBrArY_FiLe change to libraryFile
                    // Calendar.gEtInStAnCe().SeT_DaTe(SeLf.lOaN_DaTe);
                    Calendar.gEtInStAnCe().setDate(SELF.loanDate); // gEtInStAnCe change to getInstance, SeT_DaTe change to setDate, SeLf change to SELF, lOaN_DaTe change to loanDate
                    // LiBrArY_FiLe.close();
                    libraryFile.close(); // LiBrArY_FiLe change to libraryFile
				}
				catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
            // else SeLf = new Library();
            else SeLf = new Library(); // SeLf change to SELF
		}
        // return SeLf;
        return SeLf; // SeLf change to SELF
	}

	// public static synchronized void SaVe() {
	public static synchronized void SaVe() { // SaVe change to save
        // if (SeLf != null) {
        if (SeLf != null) { // SeLf change to SELF
            // SeLf.lOaN_DaTe = Calendar.gEtInStAnCe().gEt_DaTe();
            SeLf.loanDate = Calendar.getInstance().getDate(); // SeLf change to SELF, lOaN_DaTe change to loanDate, gEtInStAnCe change to getInstance, gEt_DaTe change to getDate
            // try (ObjectOutputStream LiBrArY_fIlE = new ObjectOutputStream(new FileOutputStream(lIbRaRyFiLe));) {
            try (ObjectOutputStream libraryFile = new ObjectOutputStream(new FileOutputStream(LIBRARY_FILE));) { // LiBrArY_fIlE change to libraryFile, lIbRaRyFiLe change to LIBRARY_FILE
                // LiBrArY_fIlE.writeObject(SeLf);
                libraryFile.writeObject(SeLf); // LiBrArY_fIlE change to libraryFile, SeLf change to SELF
                // LiBrArY_fIlE.flush();
                libraryFile.flush(); // LiBrArY_fIlE change to libraryFile
                // LiBrArY_fIlE.close();
                libraryFile.close(); // LiBrArY_fIlE change to libraryFile
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	// public int gEt_BoOkId() {
	public int getBookId() { // gEt_BoOkId change to getBookId
        // return bOoK_Id;
        return bookId; // bOoK_Id change to bookId
	}
	
	// public int gEt_MeMbEr_Id() {
	public int getMemberId() { // gEt_MeMbEr_Id change to getMemberId
        // return mEmBeR_Id;
        return memberId; // mEmBeR_Id change to memberId
	}
	
	// private int gEt_NeXt_BoOk_Id() {
	private int getNextBookId() { // gEt_NeXt_BoOk_Id change to getNextBookId
		// return bOoK_Id++;
		return bOoK_Id++; // bOoK_Id change to bookId
	}

	// private int gEt_NeXt_MeMbEr_Id() {
	private int getNextMemberId() { // gEt_NeXt_MeMbEr_Id change to getNextMemberId
		// return mEmBeR_Id++;
		return memberId++; // mEmBeR_Id change to memberId
	}
	
	// private int gEt_NeXt_LoAn_Id() {
	private int getNextLoanId() { // gEt_NeXt_LoAn_Id change to getNextLoanId
		// return lOaN_Id++;
		return lOaN_Id++; // lOaN_Id change to loadId
	}
	
	// public List<Member> lIsT_MeMbErS() {		
	public List<Member> listMembers() { // lIsT_MeMbErS change to listMembers		
		// return new ArrayList<Member>(MeMbErS.values()); 
		return new ArrayList<Member>(members.values()); // MeMbErS change to members
	}

	// public List<Book> lIsT_BoOkS() {
	public List<Book> listBooks() { // lIsT_BoOkS change to listBooks
		// return new ArrayList<Book>(CaTaLoG.values()); 
		return new ArrayList<Book>(catalog.values()); // CaTaLoG change to catalog
	}

	// public List<Loan> lISt_CuRrEnT_LoAnS() {
	public List<Loan> listCurrentLoans() { // lISt_CuRrEnT_LoAnS change to listCurrentLoans
		// return new ArrayList<Loan>(CuRrEnT_LoAnS.values());
		return new ArrayList<Loan>(currentLoans.values()); // CuRrEnT_LoAnS change to currentLoans
	}

	// public Member aDd_MeMbEr(String lastName, String firstName, String email, int phoneNo) {		
	public Member addMember(String lastName, String firstName, String email, int phoneNo) { // aDd_MeMbEr change to addMember
		// Member member = new Member(lastName, firstName, email, phoneNo, gEt_NeXt_MeMbEr_Id());
		Member member = new Member(lastName, firstName, email, phoneNo, getNextMemberId()); // gEt_NeXt_MeMbEr_Id change to getNextMemberId
		// MeMbErS.put(member.GeT_ID(), member);		
		members.put(member.GeT_ID(), member); // MeMbErS change to members, GeT_ID change to getId
		return member;
	}
	
	// public Book aDd_BoOk(String a, String t, String c) {		
	public Book addBook(String a, String t, String c) { // aDd_BoOk change to addBook		
		// Book b = new Book(a, t, c, gEt_NeXt_BoOk_Id());
		Book b = new Book(a, t, c, getNextBookId()); // gEt_NeXt_BoOk_Id change to getNextBookId
		// CaTaLoG.put(b.gEtId(), b);
		catalog.put(b.getId(), b); // CaTaLoG change to catalog, gEtId change to getId
		return b;
	}

	// public Member gEt_MeMbEr(int memberId) {
	public Member getMember(int memberId) { // gEt_MeMbEr change to getMember
		// if (MeMbErS.containsKey(memberId)) 
		if (members.containsKey(memberId)) // MeMbErS change to members
			// return MeMbErS.get(memberId);
			return members.get(memberId); // MeMbErS change to members
		return null;
	}
	
	// public Book gEt_BoOk(int bookId) {
	public Book getBook(int bookId) { // gEt_BoOk change to getBook
		// if (CaTaLoG.containsKey(bookId)) 
		if (catalog.containsKey(bookId)) // CaTaLoG change to catalog
			// return CaTaLoG.get(bookId);		
			return CaTaLoG.get(bookId); // CaTaLoG change to catalog
		return null;
	}
	
	// public int gEt_LoAn_LiMiT() {
	public int gEt_LoAn_LiMiT() { // gEt_LoAn_LiMiT change to getLoanLimit
		// return lOaNlImIt;
		return LOAN_LIMIT; // lOaNlImIt change to LOAN_LIMIT
	}
	
	// public boolean cAn_MeMbEr_BoRrOw(Member member) {		
	public boolean canMemberBorrow(Member member) { // cAn_MeMbEr_BoRrOw change to canMemberBorrow
		// if (member.gEt_nUmBeR_Of_CuRrEnT_LoAnS() == lOaNlImIt ) 
		if (member.getNumberOfCurrentLoans() == LOAN_LIMIT) // gEt_nUmBeR_Of_CuRrEnT_LoAnS change to getNumberOfCurrentLoans, lOaNlImIt change to LOAN_LIMIT
			return false;
				
		// if (member.FiNeS_OwEd() >= maxFinesOwed) 
		if (member.finesOwed() >= MAX_FINES_OWED) // FiNeS_OwEd change to finesOwed, maxFinesOwed change to MAX_FINES_OWED 
			return false;
				
		// for (Loan loan : member.GeT_LoAnS()) 
		for (Loan loan : member.getLoans()) // GeT_LoAnS change to getLoans
			// if (loan.Is_OvEr_DuE()) 
			if (loan.isOverDue()) // Is_OvEr_DuE change to isOverDue
				return false;
			
		return true;
	}
	
	// public int gEt_NuMbEr_Of_LoAnS_ReMaInInG_FoR_MeMbEr(Member MeMbEr) {		
	public int getNumberOfLoansRemainingForMember(Member member) { // gEt_NuMbEr_Of_LoAnS_ReMaInInG_FoR_MeMbEr change to getNumberOfLoansRemainingForMember, MeMbEr change to member
		return LOAN_LIMIT - member.getNumberOfCurrentLoans(); // lOaNlImIt change to LOAN_LIMIT, MeMbEr change to member, gEt_nUmBeR_Of_CuRrEnT_LoAnS change to getNumberOfCurrentLoans
	}
	
	// public Loan iSsUe_LoAn(Book book, Member member) {
	public Loan issueLoan(Book book, Member member) { // iSsUe_LoAn change to issueLoan
		// Date dueDate = Calendar.gEtInStAnCe().gEt_DuE_DaTe(loanPeriod);
		Date dueDate = Calendar.gEtInStAnCe().getDueDate(LOAN_PERIOD); // gEtInStAnCe change to getInstance, gEt_DuE_DaTe change to getDueDate, loanPeriod change to LOAN_PERIOD
		// Loan loan = new Loan(gEt_NeXt_LoAn_Id(), book, member, dueDate);
		Loan loan = new Loan(getNextLoanId(), book, member, dueDate); // gEt_NeXt_LoAn_Id change to getNextLoanId
		// member.TaKe_OuT_LoAn(loan);
		member.takeOutLoan(loan); // TaKe_OuT_LoAn change to takeOutLoan
		// book.BoRrOw();
		book.borrow(); // BoRrOw change to borrow
		// LoAnS.put(loan.GeT_Id(), loan);
		loans.put(loan.getId(), loan); // LoAnS change to loans, GeT_Id change to getId
		// CuRrEnT_LoAnS.put(book.gEtId(), loan);
		currentLoans.put(book.getId(), loan); // CuRrEnT_LoAnS change to currentLoans, gEtId change to getId
		return loan;
	}
		
	// public Loan GeT_LoAn_By_BoOkId(int bookId) {
	public Loan getLoanByBookId(int bookId) { // GeT_LoAn_By_BoOkId change to getLoanByBookId
		// if (CuRrEnT_LoAnS.containsKey(bookId)) 
		if (currentLoans.containsKey(bookId)) // CuRrEnT_LoAnS change to currentLoans
			// return CuRrEnT_LoAnS.get(bookId);
			return currentLoans.get(bookId); // CuRrEnT_LoAnS change to currentLoans
		
		return null;
	}
	
	// public double CaLcUlAtE_OvEr_DuE_FiNe(Loan LoAn) {
	public double calculateOverDueFine(Loan loan) { // CaLcUlAtE_OvEr_DuE_FiNe change to calculateOverDueFine, LoAn change to loan
		// if (LoAn.Is_OvEr_DuE()) {
		if (loan.isOverDue()) { // LoAn change to loan, Is_OvEr_DuE change to isOverDue
			// long DaYs_OvEr_DuE = Calendar.gEtInStAnCe().GeT_DaYs_DiFfErEnCe(LoAn.GeT_DuE_DaTe());
			long daysOverDue = Calendar.getInstance().getDaysDifference(loan.getDueDate()); // DaYs_OvEr_DuE change to daysOverDue, gEtInStAnCe change to getInstance, GeT_DaYs_DiFfErEnCe change to getDaysDifference, LoAn change to loan, GeT_DuE_DaTe change to getDueDate
			// double fInE = DaYs_OvEr_DuE * FiNe_PeR_DaY;
			double fine = daysOverDue * FINE_PER_DAY; // fInE change to fine, DaYs_OvEr_DuE change to daysOverDue, FiNe_PeR_DaY change to FINE_PER_DAY
			// return fInE;
			return fine; // fInE change to fine
		}
		return 0.0;		
	}

	// public void DiScHaRgE_LoAn(Loan cUrReNt_LoAn, boolean iS_dAmAgEd) {
	public void dischargeLoan(Loan currentLoan, boolean isDamaged) { // DiScHaRgE_LoAn change to dischargeLoan, cUrReNt_LoAn change to currentLoan, iS_dAmAgEd change to isDamaged
		// Member mEmBeR = cUrReNt_LoAn.GeT_MeMbEr();
		Member member = currentLoan.getMember(); // mEmBeR change to member, cUrReNt_LoAn change to currentLoan, GeT_MeMbEr change to getMember
		// Book bOoK  = cUrReNt_LoAn.GeT_BoOk();
		Book book  = currentLoan.getBook(); // bOoK change to book, cUrReNt_LoAn change to currentLoan, GeT_BoOk change to getBook
		
		// double oVeR_DuE_FiNe = CaLcUlAtE_OvEr_DuE_FiNe(cUrReNt_LoAn);
		double overDueFine = calculateOverDueFine(currentLoan); // oVeR_DuE_FiNe change to overDueFine, CaLcUlAtE_OvEr_DuE_FiNe change to calculateOverDueFine, cUrReNt_LoAn change to currentLoan
		// mEmBeR.AdD_FiNe(oVeR_DuE_FiNe);	
		member.addFine(overDueFine);	// mEmBeR change to member, AdD_FiNe change to addFine, oVeR_DuE_FiNe change to overDueFine
		
		// mEmBeR.dIsChArGeLoAn(cUrReNt_LoAn);
		member.dischargeLoan(currentLoan); // mEmBeR change to member, dIsChArGeLoAn change to dischargeLoan, cUrReNt_LoAn change to currentLoan
		// bOoK.ReTuRn(iS_dAmAgEd);
		book.return(isDamaged); // bOoK change to book, ReTuRn change to return, iS_dAmAgEd change to isDamaged
		// if (iS_dAmAgEd) {
		if (isDamaged) { // iS_dAmAgEd change to isDamaged
			// mEmBeR.AdD_FiNe(damageFee);
			member.addFine(DAMAGE_FEE); // mEmBeR change to member, AdD_FiNe change to addFine, damageFee change to DAMAGE_FEE
			// DaMaGeD_BoOkS.put(bOoK.gEtId(), bOoK);
			damagedBooks.put(book.getId(), book); // DaMaGeD_BoOkS change to damagedBooks, bOoK change to book, gEtId change to getId, bOoK change to book
		}
		// cUrReNt_LoAn.DiScHaRgE();
		currentLoan.discharge(); // cUrReNt_LoAn change to currentLoan, DiScHaRgE change to discharge
		currentLoan.remove(book.getId()); // cUrReNt_LoAn change to currentLoan, bOoK change to book, gEtId change to getId
	}

	// public void cHeCk_CuRrEnT_LoAnS() {
	public void checkCurrentLoans() { // cHeCk_CuRrEnT_LoAnS change to checkCurrentLoans
		for (Loan loan : currentLoans.values()) // lOaN change to loan, CuRrEnT_LoAnS change to currentLoans
			// lOaN.cHeCk_OvEr_DuE();
			loan.checkOverDue(); // lOaN change to loan, cHeCk_OvEr_DuE change to checkOverDue
	}

	// public void RePaIr_BoOk(Book cUrReNt_BoOk) {
	public void repairBook(Book currentBook) { // RePaIr_BoOk change to repairBook, cUrReNt_BoOk change to currentBook
		// if (DaMaGeD_BoOkS.containsKey(cUrReNt_BoOk.gEtId())) {
		if (damagedBooks.containsKey(currentBook.getId())) { // DaMaGeD_BoOkS change to damagedBooks, cUrReNt_BoOk change to currentBook, gEtId change to getId
			// cUrReNt_BoOk.RePaIr();
			currentBook.repair(); // cUrReNt_BoOk change to currentBook, RePaIr change to repair
			// DaMaGeD_BoOkS.remove(cUrReNt_BoOk.gEtId());
			damagedBooks.remove(currentBook.getId()); // DaMaGeD_BoOkS change to damagedBooks, cUrReNt_BoOk change to currentBook, gEtId change to getId
		}
		else 
			throw new RuntimeException("Library: repairBook: book is not damaged");
	}
}
