package com.company;

public class Sword extends Weapon
{
    private boolean EffectiveAxe;
    private boolean WeakLance;

    Sword(int d, int w, int l, int r, boolean EA, boolean WL)
    {
        super(d, w, l, r);
        EffectiveAxe = EA;
        WeakLance = WL;
    }
}
