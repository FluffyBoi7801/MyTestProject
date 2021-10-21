package org.LegOfSea;/*
 *
 * @author Artem Kuchinskii
 *
 */

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Jazzy";
    }
    @Override
    public int getTime()
    {
        return 2;
    }
}
