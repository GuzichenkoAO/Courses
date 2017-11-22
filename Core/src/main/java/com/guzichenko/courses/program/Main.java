package com.guzichenko.courses.program;

import com.guzichenko.courses.program.services.CmdLineService;
import com.guzichenko.courses.program.services.impl.ClientServiceImpl;
import com.guzichenko.courses.program.services.impl.ProductServiceImpl;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		CmdLineService cmdLineService = new CmdLineService(new ClientServiceImpl(), new ProductServiceImpl());
		cmdLineService.mainMenu();

	}
}
