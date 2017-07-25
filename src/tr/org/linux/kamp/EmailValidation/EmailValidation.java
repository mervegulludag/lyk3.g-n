package tr.org.linux.kamp.EmailValidation;

public class EmailValidation {
		public static void main(String[] args) {
			
			String mail = "mervegulludag94@gmail.com";
			
			System.out.println(isValid(mail));
		}
		
		private static boolean isValid(String email) {
			
			if(email.contains(" ")){//contains içinde bulunuyormu?
				return false;
			}
			
			if(!email.contains("@")){
				return false;
			}
			
			if(!email.contains(".")){//!tersini alır
				return false;
			}
			
			if(email.startsWith("@") || email.startsWith(".")){//startWith stringin başında varmı? || veya
				return false;
			}
			if(email.contains("@.")) {
				return false;
			}
			
			if(!(email.indexOf('@') + 1 < email.indexOf('.'))){
				return false;
			}
			
			if(!(email.lastIndexOf('.') + 2 < email.length() )){
				return false;
			}
			if(email.length()-email.lastIndexOf(".")>=2){
				return false;
			}
			return true;
		}

	}
