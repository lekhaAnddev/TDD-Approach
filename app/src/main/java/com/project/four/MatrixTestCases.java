package com.project.four;

import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by chandra on 15/12/2017.
 */
public class MatrixTestCases {
   /*
    public void matrixSingleColumn() throws Exception {
        int[][] matrixSingleColumn;
        matrixSingleColumn=new int[5][1];
        matrixSingleColumn[0][0]=5;
        matrixSingleColumn[1][0]=8;
        matrixSingleColumn[2][0]=5;
        matrixSingleColumn[3][0]=3;
        matrixSingleColumn[4][0]=5;
        MatrixTraverse mat =new MatrixTraverse(matrixSingleColumn);
        long result = MatrixTraverse.matrixSingleColumn(matrixSingleColumn);
        assertEquals(3,result);
    }

   public void matrixChkValid()throws Exception{
       int[][] matValidChk;
       long val=0;
       matValidChk = new int[][]{{5,4,'H'},{8,'M',7},{5,7,5}};
       boolean valid=MatrixTraverse.matrixChkValid(matValidChk);
       if(valid==true){val=100;}
       assertEquals(100,val);

   }

    public void matrixSingle() throws Exception {
        int[] matrixSingleRow;
        matrixSingleRow=new int[]{5,8,5,3,5};
        long result = MatrixTraverse.matrixSingle(matrixSingleRow);
        assertEquals(26,result);

    }


    public void matrixfirst() throws Exception {
        long d=MatrixTraverse.matrixfirst();
       assertEquals(8,d);

    }
*/


    public void traverse() {
        String cost;
        String path;
        String des;
        int sample1[][] = {{3, 4, 1, 2, 8, 6},
                {6, 1, 8, 2, 7, 4},
                {5, 9, 3, 9, 9, 5},
                {8, 4, 1, 3, 2, 6},
                {3, 7, 2, 8, 6, 4}
        };
        MatrixTraverse mat = new MatrixTraverse(sample1);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample1);

        int trcost = Integer.parseInt(trv.get(0));
        path = trv.get(1);
        des = trv.get(2);
        assertEquals(16, trcost);
    }

    public void traverseSecond() {
        String cost;
        String path;
        String des;
        int sample[][] = {{19, 10, 19, 10, 19}, {21, 23, 20, 19, 12}, {20, 12, 20, 11, 10}};
        MatrixTraverse mat = new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path = trv.get(1);
        des = trv.get(2);
        assertEquals(48, trcost);
    }

    public void traverseThird() {
        String cost;
        String path;
        String des;
        int sample[][] = {{5, 8, 5, 3, 5}};
        MatrixTraverse mat = new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path = trv.get(1);
        des = trv.get(2);
        assertEquals(26, trcost);
    }

    public void traverseFour() {
        String cost;
        String path;
        String des;
        int sample[][] = {{5},
                {8},
                {5},
                {3},
                {5}};
        MatrixTraverse mat = new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path = trv.get(1);
        des = trv.get(2);
        assertEquals(3, trcost);
    }

    public void traverseFive() {
        String cost;
        String path;
        String des;
        int sample[][] = {{69, 10, 19, 10, 19},
                {51, 23, 20, 19, 12},
                {60, 12, 20, 11, 10}};
        MatrixTraverse mat = new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path = trv.get(1);
        des = trv.get(2);
        assertEquals(0, trcost);
    }

    public void traverseSix() {
        String cost;
        String path;
        String des;
        int sample[][] = {{60, 3, 3, 6},
                {6, 3, 7, 9},
                {5, 6, 8, 3}};
        MatrixTraverse mat = new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path = trv.get(1);
        des = trv.get(2);
        assertEquals(14, trcost);
    }

    public void traverseSeven() {
        String cost;
        String path;
        String des;
        int sample[][] = {{6, 3, -5, 9},
                {-5, 2, 4, 10},
                {3, -2, 6, 10},
                {6, -1, -2, 10}};
        MatrixTraverse mat = new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path = trv.get(1);
        des = trv.get(2);
        assertEquals(0, trcost);
    }

    public void traverseEight() {
        String cost;
        String path;
        String des;
        int sample[][] = {{51, 51},
                {0, 51},
                {51, 51},
                {5, 5}
        };
        MatrixTraverse mat = new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path = trv.get(1);
        des = trv.get(2);
        assertEquals(10, trcost);
    }

    public void traversenine() {
        String cost;
        String path;
        String des;
        int sample[][] = {
                {51, 51, 51},
                {0, 51, 51},
                {51, 51, 51},
                {5, 5, 51}
        };

        MatrixTraverse mat = new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path = trv.get(1);
        des = trv.get(2);
        assertEquals(10, trcost);
    }

    public void traversenten() {
        String cost;
        String path;
        String des;
        int sample[][] = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
        };

        MatrixTraverse mat = new MatrixTraverse(sample);

        //int trcost=mat.traverse(sample1);
        List<String> trv = mat.traverse(sample);

        int trcost = Integer.parseInt(trv.get(0));
        path = trv.get(1);
        des = trv.get(2);
        assertEquals(20, trcost);

    }


    public void traverseValidChk() {
        int sample[][] = {{5, 6, 'M'}, {8, 3, 'N'}

        };
        MatrixTraverse mat = new MatrixTraverse(sample);
        List<String> trv = mat.traverse(sample);
        //String validChk=trv.get(1);
        int valitBit = Integer.parseInt(trv.get(1));
        assertEquals(-1, valitBit);
    }
}