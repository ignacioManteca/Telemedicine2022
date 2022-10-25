package operations;


import java.util.Date;
import java.util.Vector;

import javax.bluetooth.RemoteDevice;

import Objects.Test;

import java.util.logging.Level;
import java.util.logging.Logger;
import operations.StoreInfo;

public class BitalinoDemo {

    public static Frame[] frame;

    public static void main(String[] args) {

        BITalino bitalino = null;
        Test test = null;
        Date date = null;
        StoreInfo file = null;
        try {
        	file = new StoreInfo();
        	test = new Test();
        	date = new Date();
            bitalino = new BITalino();
            test.setDate(date);
            // Code to find Devices
            //Only works on some OS
            Vector<RemoteDevice> devices = bitalino.findDevices();
            System.out.println(devices);

            //You need TO CHANGE THE MAC ADDRESS
            //You should have the MAC ADDRESS in a sticker in the Bitalino
            String macAddress = "20:16:07:18:13:61";
            
            //Sampling rate, should be 10, 100 or 1000
            int SamplingRate = 1000;
            test.setFrequence(SamplingRate);
            bitalino.open(macAddress, SamplingRate);

            // Start acquisition on analog channels A2 and A6
            // For example, If you want A1, A3 and A4 you should use {0,2,3}
            int[] channelsToAcquire = {0};
            bitalino.start(channelsToAcquire);

            //Read in total 10000000 times
            for (int j = 0; j < 150; j++) {

                //Each time read a block of 10 samples 
                int block_size=10;
                frame = bitalino.read(block_size);

                //System.out.println("size block: " + frame.length);

                //Print the samples
                for (int i = 1; i < frame.length+1; i++) {
                    /*System.out.println((j * block_size + i) + " seq: " + frame[i].seq + " "
                            + frame[i].analog[0] + " "
                    //  + frame[i].analog[2] + " "
                    //  + frame[i].analog[3] + " "
                    //  + frame[i].analog[4] + " "
                    //  + frame[i].analog[5]
                    );*/
                    test.sequence.add(j * block_size + i);
                    test.value.add(frame[i].analog[0]);
                }
            }
            //stop acquisition
            test.printList(test.sequence, test.value);
            bitalino.stop();
        } catch (BITalinoException ex) {
            Logger.getLogger(BitalinoDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Throwable ex) {
            Logger.getLogger(BitalinoDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //close bluetooth connection
                if (bitalino != null) {
                    bitalino.close();
                }
            } catch (BITalinoException ex) {
                Logger.getLogger(BitalinoDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println(test.toString());
        file.salida(test, "Basilio Aguirre");
    }

}
