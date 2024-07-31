package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    private boolean isOn;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
        this.isOn = false;
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
        this.isOn = true;
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
        this.isOn = false;
    }

    @Override
    public int read() {
        if (!this.isOn || this.sensors.isEmpty()) {
            throw new IllegalStateException("Average sensor is off or no sensors added");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }

        int average = sum / sensors.size();
        this.readings.add(average);
        return average;
    }

    public List<Integer> readings() {
        return new ArrayList<>(this.readings);
    }
}

