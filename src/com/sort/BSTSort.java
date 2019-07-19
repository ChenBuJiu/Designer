package com.sort;

/**
 * @author evans
 * @create 2019-06-13 2019/6/13
 * --
 **/
public class BSTSort {
    public static void sort(int[] array){

    }
    class BST{
        int number;
        BST left = null;
        BST right = null;

        public BST(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public BST getLeft() {
            return left;
        }

        public void setLeft(BST left) {
            this.left = left;
        }

        public BST getRight() {
            return right;
        }

        public void setRight(BST right) {
            this.right = right;
        }

    }
    public static void main(String[] args) {

    }
}
