package com.guzichenko.program;

import com.guzichenko.program.services.CmdLineService;
import com.guzichenko.program.services.impl.ClientServiceDb;
import com.guzichenko.program.services.impl.ProductServiceImpl;

public class Main {
    public static void main(String[] args) throws Exception {

        CmdLineService cmdLineService = new CmdLineService(new ClientServiceDb(), new ProductServiceImpl());
        cmdLineService.mainMenu();

    }
}
