
public class StringReplace {

	public static void main(String[] args) {
        String ext = "http://forms.franklin.edu/ecf/mac/updateEmployee.html?" +
        		"requestType=1&employeeID=tobinjo&employeeName=Joel%20Tobin&employeeType=default" +
        		"&employeeTitle=Administrative%20Assistant&%20to%20VP%20of%20Accreditation%20&%20IE" +
        		"&employeeDepartment=Institutional%20Effectiveness&supervisorID=ShayP" +
        		"&effectiveDate=Thursday,%2008/25/2011";
        
        System.out.println(ext.replace("&", "%20"));
        
        //System.out.println("abcabcabc.abc".replaceAll(ext, "123"));   // 123123123.123


	}

}
