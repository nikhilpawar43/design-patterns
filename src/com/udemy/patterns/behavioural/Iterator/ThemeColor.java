package com.udemy.patterns.behavioural.Iterator;

public enum ThemeColor {
    
    RED,
    GREEN,
    BLUE,
    WHITE,
    BLACK;
    
    public static ThemeColorIterator<ThemeColor> getInstance() {
        return new ThemeColorIterator<ThemeColor>();
    }

    private static class ThemeColorIterator<ThemeColor> implements Iterator<ThemeColor> {
        
        private int position;

        @Override
        public boolean hasNext() {
            return position < values().length;
        }

        @Override
        public ThemeColor next() {
            return (ThemeColor) values()[position++];
        }
    }
    
}
