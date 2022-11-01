package week5;


public class App {
		
		public static void main(String[] args) {
			
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.Log("Green");
		asteriskLogger.Error("Blue");
		
		System.out.println();
		
		spacedLogger.Log("Greenish");
		spacedLogger.Error("Blueish");
		}
	};
	
