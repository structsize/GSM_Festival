
#include <SoftwareSerial.h>
#include "HX711.h"
#include <stdio.h>


const int LOADCELL_DOUT_PIN = A1;
const int LOADCELL_SCK_PIN = A0;
char str[20];

HX711 scale;

float calibration_factor = -14300;

SoftwareSerial BTSerial(2, 3); //Connect HC-06. Use your (TX, RX) settings

void setup()  
{
  
  Serial.begin(9600);
  BTSerial.begin(9600);  // set the data rate for the BT port
  scale.begin(LOADCELL_DOUT_PIN, LOADCELL_SCK_PIN);
  scale.set_scale(calibration_factor);
  scale.tare(); 
}
void loop()
{
  int a;
  if(scale.get_units()*-0.453592>50){
    a = (int)(scale.get_units()*-0.453592)+5;
  }
  else{
    a = (int)(scale.get_units()*-0.453592);
  }
   
  // BT –> Data –> Serial
  if (BTSerial.available()) { 
   BTSerial.println(a);
   Serial.println(a);
  }
  
  
}
