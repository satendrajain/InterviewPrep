
public class noInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "We found 25 channels. Reposition antenna and rescan if you think you're missing channels.";
		
		String[] strarray = str.split(" ");
		
		str = str.replaceAll("[^0-9]+", " ");
		int no = Integer.parseInt(str.trim());
		
		System.out.println("No ->"+ no);
		
		/*
		 * for(String st: strarray) { try { int n = Integer.parseInt(st);
		 * System.out.println("N ->" + n); break; } catch(Exception e) {
		 * System.out.println("its String"); }
		 * 
		 * }
		 */
	}

}
