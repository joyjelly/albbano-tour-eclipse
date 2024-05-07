package vo;

public class AdminSearchVO {

	private String currentPage;
	private int startNum, endNum;

	public AdminSearchVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public AdminSearchVO(String currentPage, int startNum, int endNum) {
		super();
		this.currentPage = currentPage;
		this.startNum = startNum;
		this.endNum = endNum;
	}



	public String getCurrentPage() {
		return currentPage;
	}



	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}




	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}



	@Override
	public String toString() {
		return "AdminSearchVO [currentPage=" + currentPage + ", startNum=" + startNum + ", endNum=" + endNum + "]";
	}

	
	
	
}
