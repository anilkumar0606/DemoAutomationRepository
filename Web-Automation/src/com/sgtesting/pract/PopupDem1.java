package com.sgtesting.pract;

public class PopupDem1 {

	public static void main(String[] args) {
		executionautoit();
		

	}

	private static void executionautoit()
	{
		try
		{
			Runtime runtime=Runtime.getRuntime();
			runtime.exec("C:\\ExampleAutomation\\Automation\\AutoIT\\WriteinNotepadand Dontsave.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
