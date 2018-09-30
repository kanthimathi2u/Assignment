package com.org.app.assignment;

import com.org.app.assignment.InputProcess;
import com.org.app.assignment.OutputProcess;

public class AssignmentProgram{

	/**
	 * If no argument is provided then the input file present inside main.com.app.logic package is
	 * picked up as input file by default.
	 * @param args
	 */
	public static void main(String[] args) {
		String filePath = null;
		if (args.length != 0)
			filePath = args[0];
		try{
			InputProcess.ProcessFile(filePath);
			InputProcess.MapTokentoIntegerValue();
			OutputProcess.processReplyForQuestion();
		}
		catch(Exception e){
			System.out.println("Something went wrong....File Not Found ");
		}
	}

}