package com.ageng.setyo.chess;

public class Piece {
    int positionX;
    int positionY;
    boolean isWhite;
    String symbol;

    public Piece(int positionX, int positionY, boolean isWhite, String symbol) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.isWhite = isWhite;
        this.symbol = symbol;
    }

    public boolean validateMove(int newX, int newY, int oldX, int oldY) {
        return true;
    }

    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
