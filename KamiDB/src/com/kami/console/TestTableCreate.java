/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kami.console;

import com.kamike.db.generic.GenericCreate;

/**
 *
 * @author THiNk
 */
public class TestTableCreate extends GenericCreate<TestTable>{

    public TestTableCreate() {
        super();
    }

    @Override
    public TestTable create() {
        return new TestTable();
    }
    
}
