package org.example;

import java.util.Arrays;

enum Color { RED, GREEN, BLUE, YELLOW }

// Class representing a single face of the Pyraminx Cube
class Face {
    private Color[] tiles;

    public Face(Color color) {
        this.tiles = new Color[9]; // Each face has 9 tiles
        Arrays.fill(this.tiles, color);
    }

    public Color[] getTiles() {
        return tiles;
    }

    public boolean isValidFace() {
        if (tiles.length != 9) return false;
        Color firstColor = tiles[0];
        for (Color tile : tiles) {
            if (tile != firstColor) return false;
        }
        return true;
    }
}

// Main class representing the Pyramid Rubik's Cube
public class PyramidRubiksCube {
    private Face[] faces;

    public PyramidRubiksCube() {
        this.faces = new Face[4];
        initializeFaces();
        initializeEdges();
    }

    // Initialize the faces with uniform colors
    private void initializeFaces() {
        faces[0] = new Face(Color.RED);
        faces[1] = new Face(Color.GREEN);
        faces[2] = new Face(Color.BLUE);
        faces[3] = new Face(Color.YELLOW);
    }

    // Placeholder for edge initialization
    private void initializeEdges() {
        // Logic to ensure edges have proper placement and colors
    }

    // Validate if the Pyraminx Cube is in a valid state
    public boolean validateCube() {
        for (Face face : faces) {
            if (!face.isValidFace()) {
                return false;
            }
        }
        return true;
    }

    public Face[] getFaces() {
        return faces;
    }

    // Print the cube's current state (for debugging purposes)
    public void displayCube() {
        for (int i = 0; i < faces.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + Arrays.toString(faces[i].getTiles()));
        }
    }

    public static void main(String[] args) {
        PyramidRubiksCube cube = new PyramidRubiksCube();
        cube.displayCube();
        System.out.println("Is cube valid? " + cube.validateCube());
    }
}
