class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int totalRows = image.length;
        int totalCols = image[0].length;
        int[][] directions = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        System.out.println("FloodFIll: total rows " + totalRows + " total cols: " + totalCols + " sr " + sr + " sc " + sc + " color");
        
        int srcColor = image[sr][sc];
        image[sr][sc] = color;

        Queue<int[]> points = new LinkedList<>();
        for (int[] direction : directions) {
            points.add(new int[]{ sr + direction[0], sc + direction[1]});
        }

        while (points.size() != 0) {
            int[] newPoint = points.poll();
            int newR = newPoint[0], newC = newPoint[1];
            
            // check within bounds
            if (newR >= 0 && newR < totalRows && newC >= 0 && newC < totalCols && image[newR][newC] == srcColor) {
                // change the color and append new adjacent points
                if (srcColor != color) {
                    image[newR][newC] = color;
                    for (int[] direction : directions) {
                        points.add(new int[]{ newR + direction[0], newC + direction[1]});
                    }
                }
            }
        }

        return image;
    }
}