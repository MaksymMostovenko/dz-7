public enum Planet {
    MERCURY(1, 0, 57.9, 2439.7, null, "VENUS"),
    VENUS(2, 108.2, 108.2 + 0.7, 6051.8, "MERCURY", "TERRA"),
    TERRA(3, 149.6, 149.6 - 108.2, 6371.0, "VENUS", "MARS"),
    MARS(4, 227.9, 227.9 - 149.6, 3389.5, "TERRA", "JUPITER"),
    JUPITER(5, 778.6, 778.6 - 227.9, 69911, "MARS", "SATURN"),
    SATURN(6, 1433.5, 1433.5 - 778.6, 58232, "JUPITER", "URANUS"),
    URANUS(7, 2872.5, 2872.5 - 1433.5, 25362, "SATURN", "NEPTUNE"),
    NEPTUNE(8, 4495.1, 4495.1 - 2872.5, 24622, "URANUS", null);

    private int orderFromSun;
    private double distanceFromPrevious;
    private double distanceFromSun;
    private double radius;
    private String previousPlanet;
    private String nextPlanet;

    Planet(int orderFromSun, double distanceFromPrevious, double distanceFromSun, double radius, String previousPlanet, String nextPlanet) {
        this.orderFromSun = orderFromSun;
        this.distanceFromPrevious = distanceFromPrevious;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public double getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public String getPreviousPlanet() {
        return previousPlanet;
    }

    public String getNextPlanet() {
        return nextPlanet;
    }
}
