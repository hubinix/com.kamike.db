/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamike.db;

import java.util.ArrayList;

public abstract class GenericReader<T> {

    public abstract int count();

    protected String dbName;

    protected GenericReader(String dbName) {

        this.dbName = dbName;
    }

    public abstract ArrayList<T> find();

    public abstract ArrayList<T> find(T t);

    public abstract T get(T t);

}
