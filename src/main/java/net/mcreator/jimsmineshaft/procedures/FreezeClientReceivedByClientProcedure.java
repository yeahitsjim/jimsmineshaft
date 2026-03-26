package net.mcreator.jimsmineshaft.procedures;

public class FreezeClientReceivedByClientProcedure {
	public static void execute() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}