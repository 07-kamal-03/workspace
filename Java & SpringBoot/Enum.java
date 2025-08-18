enum Planet {
        MERCURY(3.303e+23, 2.4397e6),
        EARTH(5.976e+24, 6.37814e6),
        MARS(6.421e+23, 3.3972e6);

        private final double mass;   // in kilograms
        private final double radius; // in meters


        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
            System.out.println(mass+", "+radius);
        }

        public double surfaceGravity() {
            double G = 6.67300E-11;
            System.out.println("SG: "+mass+": "+radius);
            return G * mass / (radius * radius);
        }

        public double surfaceWeight(double otherMass) {
            return otherMass * surfaceGravity();
        }
    }

    public class Enum {
        public static void main(String[] args) {
            double earthWeight = 70; // kg
            Planet p = Planet.EARTH;
            System.out.println("Your weight on Earth is " + p.surfaceWeight(earthWeight));
        }
    }
