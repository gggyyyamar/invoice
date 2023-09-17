
public class Demo {

	public static void main(String[] args) {
	
		String soldTo = "C026-01-0914/2022", address = "Njagi Griffins Gitari", contactNo= "0100100100", date = "28/04/2020";
		int []quantity = {4,10,9,10};
		int []unitPrice = {20, 50,30,80};
		double []amount = {80, 500, 270, 800};
		String []itemDescription = {"Pencil", "Duster", "Pens", "crayon"};
		double sum = amount[0] + amount[1] + amount[2]+ amount[3];
		double vat = 0.16 * sum;
		double total = sum + vat;
		System.out.println("*************************Adamson Computers Ltd***************************");
		System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City  *  Tel. No:123-4567");
		System.out.println("\t\t VAT REG. TIN 098-765-4321-0000");
		System.out.println("\t\t\t SALES INVOICE");
		System.out.println("\n");
		System.out.print("Sold to:" + soldTo);
		System.out.println("\t\t\t\tDate: " + date);
		System.out.print("Address:" + address);
		System.out.println("\t\t\t\tContact Number: " + contactNo);
		System.out.println("\n");
		System.out.println("=================================================================================");
		System.out.println("Qty\t| \tItem Description\t| \tUnit Price\t\t|Amount");
		System.out.println("=================================================================================");
		System.out.println(quantity[0] + "\t|" + "\t" + itemDescription[0] +"\t\t\t|\t" + unitPrice[0]+ "\t\t\t|" +amount[0]);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(quantity[1] + "\t|" + "\t" + itemDescription[1] +"\t\t\t|\t" + unitPrice[1]+ "\t\t\t|" +amount[1]);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(quantity[2] + "\t|" + "\t" + itemDescription[2] +"\t\t\t|\t" + unitPrice[2]+ "\t\t\t|" +amount[2]);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(quantity[3] + "\t|" + "\t" + itemDescription[3] +"\t\t\t|\t" + unitPrice[3]+ "\t\t\t|" +amount[3]);
		System.out.println("=================================================================================");
		System.out.println("\t\t\t\t\t        |Sub Total\t        |"+ String.format("%.2f", sum));
		System.out.println("\t\t\t\t\t        ================================");
		System.out.println("\t\t\t\t\t        |VAT(16%)\t        |" + String.format("%.2f", vat));
		System.out.println("\t\t\t\t\t        ================================");
		System.out.println("\t\t\t\t\t        |Total Amount\t        |" + String.format("%.2f", total));
		System.out.println("\t\t\t\t\t        ================================");
	}

}
