package practical;

public class Report_card {

	public static void main(String[] args) {
					int marks [][]=  {{78, 76, 94, 86, 88},	{91, 71, 98, 65, 76}, {95, 45, 78, 52, 49}};   
							int sum = 0;
							for (int i=0;i<marks.length;i++) {  
								for (int j=0;j< marks[i].length;j++) {
									sum = sum + marks[i][j];
								
								}
							}
							
		    		   
					System.out.println(sum);
	}
}
							
