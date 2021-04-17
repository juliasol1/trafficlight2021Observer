import trafficlight.ctrl.TrafficLightCtrl;

//Bauen Sie den Controller auf einen Singelton um

public class MCP {
    public static void main(String[] args) {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.run();


    }
}

/*
public class MCP {

        private static TrafficLightCtrl ctrl = new TrafficLightCtrl();
    private static Object TrafficLightCtrl;

    private MCP() {} //private constructor

    public static void main(String[] args) {
    }

            public static Object getInstance() {
                if (TrafficLightCtrl == null) {
                    TrafficLightCtrl ctrl = new TrafficLightCtrl();
                }
                return TrafficLightCtrl;
            }
        }
}

*/