class Project1{
	public static void main(String[] args){
	String id=args[0];
	boolean flag=false;
	int salary=0;
	int i=1;
	int j=1;
	String[][] employee={{"Emp No.","Emp Name","Join Date","Designation Code","Department","Basic","HRA","IT"},
			     {"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
			     {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
			     {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
			     {"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
			     {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
			     {"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
			     {"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}};
	String[][] DA={	{"Designation Code","Designation","DA"},
			{"e","Engineer","20000"},
			{"c","Consultant","32000"},
			{"k","Clerk","12000"},
			{"r","Receptionist","15000"},
			{"m","Manager","40000"}
			};
	for(i=1;i<employee.length;i++){
		if(id.equals(employee[i][0])){
			flag=true;
			break;
			}
		}
	if(!flag){
		System.out.print("There is no employee with empid: "+id);
		return;
		}else{
		salary=Integer.parseInt(employee[i][5])+Integer.parseInt(employee[i][6])-Integer.parseInt(employee[i][7]);
		}
	for(j=1;j<DA.length;j++){
		if(employee[i][3].equals(DA[j][0])){
			salary=salary+Integer.parseInt(DA[j][2]);
			break;		
		}

		}
	System.out.println(employee[0][0]+"   "+employee[0][1]+"   "+employee[0][4]+"   "+DA[0][1]+"   Salary");
	System.out.println(employee[i][0]+"  "+employee[i][1]+"  "+employee[i][4]+"  "+DA[j][1]+"  "+salary);
	
			
		

	

	}

	
}