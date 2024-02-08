
import java.util.HashMap;

public class ElectricalTechnologySubjects {
    public static void main(String[] args) {
        HashMap<String, String> electricalSubjects = new HashMap<>();

        // 1st Semester
        electricalSubjects.put("66711", "Basic Electricity");
        electricalSubjects.put("66713", "Electrical Engineering Materials");
        electricalSubjects.put("66811", "Basic Electronics");
        electricalSubjects.put("61011", "Engineering Drawing");
        electricalSubjects.put("65911", "Mathematics‐1");
        electricalSubjects.put("65913", "Chemistry");
        electricalSubjects.put("65812", "Physical Education & Life Skill Development");

        // 2nd Semester
        electricalSubjects.put("66721", "Electrical Circuits‐1");
        electricalSubjects.put("66722", "Electrical Appliances");
        electricalSubjects.put("66611", "Computer Application");
        electricalSubjects.put("65921", "Mathematics‐2");
        electricalSubjects.put("65912", "Physics‐1");
        electricalSubjects.put("65711", "Bangla");
        electricalSubjects.put("65712", "English");

        // 3rd Semester
        electricalSubjects.put("66731", "Electrical Circuits ‐2");
        electricalSubjects.put("66732", "Advanced Electricity");
        electricalSubjects.put("66733", "Electrical Engineering Drawing");
        electricalSubjects.put("65931", "Mathematics ‐3");
        electricalSubjects.put("65922", "Physics ‐2");
        electricalSubjects.put("65722", "Communicative English");
        electricalSubjects.put("65811", "Social Science");

        // 4th Semester
        electricalSubjects.put("66741", "Electrical Installation Planning and Estimating");
        electricalSubjects.put("66742", "DC Machines");
        electricalSubjects.put("66845", "Industrial Electronics");
        electricalSubjects.put("67045", "Applied Mechanics");
        electricalSubjects.put("66631", "Programming Essentials");
        electricalSubjects.put("65841", "Business organization & Communication");

        // 5th Semester
        electricalSubjects.put("66751", "Electrical & Electronic Measurement‐1");
        electricalSubjects.put("66752", "Generation of Electrical Power");
        electricalSubjects.put("66753", "Renewable Energy");
        electricalSubjects.put("66856", "Digital Electronics & Microprocessor");
        electricalSubjects.put("69054", "Environmental Studies");
        electricalSubjects.put("65851", "Accounting Theory & Practice");

        // 6th Semester
        electricalSubjects.put("66761", "Alternating Current Machines‐1");
        electricalSubjects.put("66762", "Electrical & Electronic Measurement‐2");
        electricalSubjects.put("66763", "Transmission and Distribution of Electrical Power‐1");
        electricalSubjects.put("66867", "Communication Engineering");
        electricalSubjects.put("66868", "Micro Controller & PLC");
        electricalSubjects.put("65852", "Industrial Management");

        // 7th Semester
        electricalSubjects.put("66771", "Alternating Current Machines‐2");
        electricalSubjects.put("66772", "Electrical Engineering project");
        electricalSubjects.put("66773", "Switch Gear & Protection");
        electricalSubjects.put("66774", "Transmission and Distribution of Electrical Power‐2");
        electricalSubjects.put("66775", "Testing and Maintenance of Electrical Equipment");
        electricalSubjects.put("66863", "Instrumentation and Process Control");
        electricalSubjects.put("65853", "Innovation & Entrepreneurship");

        // Displaying the HashMap
        System.out.println("HashMap for Electrical Technology Subjects:");
        for (String key : electricalSubjects.keySet()) {
            System.out.println("Subject Code: " + key + ", Subject Name: " + electricalSubjects.get(key));
        }
    }
}



import java.util.HashMap;

public class CivilTechnologySubjects {
    public static void main(String[] args) {
        HashMap<String, String> civilSubjects = new HashMap<>();

        // 1st Semester
        civilSubjects.put("61011", "Engineering drawing");
        civilSubjects.put("65712", "English");
        civilSubjects.put("65711", "Bangla");
        civilSubjects.put("65912", "Physics‐1");
        civilSubjects.put("65911", "Mathematics‐1");
        civilSubjects.put("67012", "Workshop practice");
        civilSubjects.put("66712", "Electrical engineering fundamental");

        // 2nd Semester
        civilSubjects.put("66421", "Civil engineering materials");
        civilSubjects.put("65921", "Mathematics‐2");
        civilSubjects.put("65722", "Communicative English");
        civilSubjects.put("66611", "Computer application");
        civilSubjects.put("65922", "Physics‐2");
        civilSubjects.put("65812", "Physical education and life skill development");
        civilSubjects.put("66822", "Electronic engineering fundamentals");

        // 3rd Semester
        civilSubjects.put("66431", "Civil engineering drawing‐1");
        civilSubjects.put("66433", "Construction process‐1");
        civilSubjects.put("66432", "Surveying‐1");
        civilSubjects.put("65931", "Mathematics‐3");
        civilSubjects.put("66434", "Civil workshop practice");
        civilSubjects.put("65811", "Social science");
        civilSubjects.put("65913", "Chemistry");

        // 4th Semester
        civilSubjects.put("66441", "Structural mechanics");
        civilSubjects.put("66444", "Surveying‐2");
        civilSubjects.put("66442", "Estimating & costing‐1");
        civilSubjects.put("69054", "Environmental studies");
        civilSubjects.put("66445", "Geotechnical engineering");
        civilSubjects.put("65841", "Business organization & communication");
        civilSubjects.put("66443", "Civil engineering drawing‐2 (CAD)");

        // 5th Semester
        civilSubjects.put("66451", "Construction process‐2");
        civilSubjects.put("66454", "Theory of structure");
        civilSubjects.put("66452", "Surveying‐3");
        civilSubjects.put("66456", "Hydraulics");
        civilSubjects.put("66453", "Water supply engineering");
        civilSubjects.put("66455", "Estimating & costing‐2");
        civilSubjects.put("65851", "Accounting theory & practice");

        // 6th Semester
        civilSubjects.put("66461", "Advance surveying");
        civilSubjects.put("66463", "Design of structure‐1");
        civilSubjects.put("66462", "Transportation engineering‐1");
        civilSubjects.put("66465", "Foundation engineering");
        civilSubjects.put("66464", "Civil engineering drawing‐3 (CAD)");
        civilSubjects.put("65852", "Industrial Management");
        civilSubjects.put("66466", "Civil engineering software");

        // 7th Semester
        civilSubjects.put("68873", "Construction management & documentation");
        civilSubjects.put("66473", "Transportation engineering‐2");
        civilSubjects.put("66472", "Sanitary engineering");
        civilSubjects.put("66475", "Water resources engineering");
        civilSubjects.put("66474", "Design of structure-2");
        civilSubjects.put("65853", "Innovation & Entrepreneurship");
        civilSubjects.put("66476", "Civil engineering project");

        // Displaying the HashMap
        System.out.println("HashMap for Civil Technology Subjects:");
        for (String key : civilSubjects.keySet()) {
            System.out.println("Subject Code: " + key + ", Subject Name: " + civilSubjects.get(key));
        }
    }
}




import java.util.HashMap;

public class ComputerTechnologySubjects {
    public static void main(String[] args) {
        HashMap<String, String> computerSubjects = new HashMap<>();

        // 1st Semester
        computerSubjects.put("65911", "Mathematics‐1");
        computerSubjects.put("66611", "Computer application");
        computerSubjects.put("65912", "Physics‐1");
        computerSubjects.put("66712", "Electrical engineering fundamentals");
        computerSubjects.put("65712", "English");
        computerSubjects.put("65812", "Physical education & life skills development");
        computerSubjects.put("65711", "Bangla");

        // 2nd Semester
        computerSubjects.put("66621", "Database Application");
        computerSubjects.put("65921", "Mathematics-2");
        computerSubjects.put("66622", "IT support System-I");
        computerSubjects.put("65922", "Physics-2");
        computerSubjects.put("66623", "Graphics Design-I");
        computerSubjects.put("65722", "Communicative English");
        computerSubjects.put("66823", "Analog Electronics");

        // 3rd Semester
        computerSubjects.put("66631", "Programming Essentials");
        computerSubjects.put("65931", "Mathematics‐3");
        computerSubjects.put("66632", "Web Design");
        computerSubjects.put("65913", "Chemistry");
        computerSubjects.put("66633", "Graphics design‐II");
        computerSubjects.put("65811", "Social Science");
        computerSubjects.put("66634", "IT support System‐II");

        // 4th Semester
        computerSubjects.put("66641", "Object-Oriented Programming");
        computerSubjects.put("66643", "Web Development");
        computerSubjects.put("66642", "Data Structure & Algorithm");
        computerSubjects.put("66645", "Computer Peripherals");
        computerSubjects.put("66644", "Data Communication System");
        computerSubjects.put("65841", "Business Organization & Communication");
        computerSubjects.put("66842", "The principle of Digital Electronics");

        // 5th Semester
        computerSubjects.put("66651", "Programming in Java");
        computerSubjects.put("66653", "Surveillance Security System");
        computerSubjects.put("66654", "Web Development Project");
        computerSubjects.put("66652", "Operating Systems application");
        computerSubjects.put("66656", "PCB Design and Circuit Making");
        computerSubjects.put("65851", "Accounting Theory & Practice");
        computerSubjects.put("66655", "Sequential Logic System");

        // 6th Semester
        computerSubjects.put("66661", "Principals of Software Engineering");
        computerSubjects.put("66663", "Microcontroller Application");
        computerSubjects.put("66662", "Microprocessor & Interfacing");
        computerSubjects.put("66664", "Database Management System");
        computerSubjects.put("65852", "Industrial Management");
        computerSubjects.put("64054", "Environmental Studies");

        // 7th Semester
        computerSubjects.put("66671", "System Analysis & Design");
        computerSubjects.put("66674", "E‐Commerce & CMS");
        computerSubjects.put("66672", "Network Administration & Services");
        computerSubjects.put("66675", "Cyber Security & Ethics");
        computerSubjects.put("65853", "Innovation & Entrepreneurship");
        computerSubjects.put("66673", "Apps Development Project");
        computerSubjects.put("6667X", "Optional Subject‐II");

        // Displaying the HashMap
        System.out.println("HashMap for Computer Technology Subjects:");
        for (String key : computerSubjects.keySet()) {
            System.out.println("Subject Code: " + key + ", Subject Name: " + computerSubjects.get(key));
        }
    }
}



import java.util.HashMap;

public class ElectronicsTechnologySubjects {
    public static void main(String[] args) {
        HashMap<String, String> electronicsSubjects = new HashMap<>();

        // 1st Semester
        electronicsSubjects.put("66811", "Basic Electronics");
        electronicsSubjects.put("61011", "Engineering Drawing");
        electronicsSubjects.put("66712", "Electrical Engineering Fundamentals");
        electronicsSubjects.put("65911", "Mathematics‐1");
        electronicsSubjects.put("65811", "Social Science");
        electronicsSubjects.put("65812", "Physical education & Life Skill Development");
        electronicsSubjects.put("65712", "English");

        // 2nd Semester
        electronicsSubjects.put("66821", "Electronic Devices and Circuits");
        electronicsSubjects.put("66611", "Computer Application");
        electronicsSubjects.put("65912", "Physics‐1");
        electronicsSubjects.put("65921", "Mathematics‐2");
        electronicsSubjects.put("65711", "Bangla");
        electronicsSubjects.put("65712", "English");

        // 3rd Semester
        electronicsSubjects.put("66831", "Advanced Electronic Devices and Circuits");
        electronicsSubjects.put("66832", "PCB Design and Prototyping");
        electronicsSubjects.put("66833", "Electronic Appliances");
        electronicsSubjects.put("66835", "Basic Communication Engineering");
        electronicsSubjects.put("65922", "Physics‐2");
        electronicsSubjects.put("65931", "Mathematics‐3");
        electronicsSubjects.put("65722", "Communicative English");

        // 4th Semester
        electronicsSubjects.put("66743", "Electrical Circuits & Machine");
        electronicsSubjects.put("66842", "Principles of Digital Electronics");
        electronicsSubjects.put("66845", "Industrial Electronics");
        electronicsSubjects.put("66841", "Networks, Filters, and Transmission Lines");
        electronicsSubjects.put("66844", "Electronic Servicing‐1");
        electronicsSubjects.put("66631", "Programming Essentials");
        electronicsSubjects.put("65841", "Business Organization & Communication");

        // 5th Semester
        electronicsSubjects.put("66851", "Television & Radio Engineering");
        electronicsSubjects.put("66852", "Electronic Measuring Instruments");
        electronicsSubjects.put("66853", "Advanced Communication Engineering");
        electronicsSubjects.put("66854", "Advanced Digital Electronics");
        electronicsSubjects.put("66855", "Electronic Servicing‐2");
        electronicsSubjects.put("69054", "Environmental Studies");
        electronicsSubjects.put("65851", "Accounting Theory & Practice");

        // 6th Semester
        electronicsSubjects.put("66861", "Electronic Measurements");
        electronicsSubjects.put("66862", "TV Broadcasting and Studio");
        electronicsSubjects.put("66863", "Instrumentation & Process Control");
        electronicsSubjects.put("66662", "Microprocessor and Interfacing");
        electronicsSubjects.put("66864", "Microcontroller & embedded system");
        electronicsSubjects.put("66865", "Electronic Project ‐1 (Contd…)");
        electronicsSubjects.put("65852", "Industrial Management");

        // 7th Semester
        electronicsSubjects.put("66871", "Computer Control & Robotics");
        electronicsSubjects.put("66872", "Microwave Radar & Navigation Aids");
        electronicsSubjects.put("66873", "Bio‐Medical Instrument");
        electronicsSubjects.put("66874", "Industrial Automation & PLC");
        electronicsSubjects.put("66875", "Project‐2");
        electronicsSubjects.put("65853", "Innovation & Entrepreneurship");

        // Displaying the HashMap
        System.out.println("HashMap for Electronics Technology Subjects:");
        for (String key : electronicsSubjects.keySet()) {
            System.out.println("Subject Code: " + key + ", Subject Name: " + electronicsSubjects.get(key));
        }
    }
}

import java.util.HashMap;

public class MechanicalTechnologySubjects {
    public static void main(String[] args) {
        HashMap<String, String> mechanicalSubjects = new HashMap<>();

        // 1st Semester
        mechanicalSubjects.put("61011", "Engineering Drawing");
        mechanicalSubjects.put("67013", "Mechanical Engineering Materials");
        mechanicalSubjects.put("66712", "Electrical Engineering Fundamentals");
        mechanicalSubjects.put("65711", "Bangla");
        mechanicalSubjects.put("65812", "Physical Education & Life Skill Development");
        mechanicalSubjects.put("65911", "Mathematics‐1");
        mechanicalSubjects.put("65913", "Chemistry");

        // 2nd Semester
        mechanicalSubjects.put("67021", "Advanced Mechanical Engineering Drawing");
        mechanicalSubjects.put("67022", "Machine Shop Practice‐1");
        mechanicalSubjects.put("67023", "Mechanical Workshop Practice");
        mechanicalSubjects.put("65712", "English");
        mechanicalSubjects.put("65921", "Mathematics‐2");
        mechanicalSubjects.put("65912", "Physics‐1");
        mechanicalSubjects.put("65811", "Social Science");

        // 3rd Semester
        mechanicalSubjects.put("67031", "Machine Shop Practice‐2");
        mechanicalSubjects.put("66822", "Electronic Engineering Fundamentals");
        mechanicalSubjects.put("65722", "Communicative English");
        mechanicalSubjects.put("65931", "Mathematics‐3");
        mechanicalSubjects.put("65922", "Physics‐2");
        mechanicalSubjects.put("66611", "Computer Application");
        mechanicalSubjects.put("67032", "Foundry & Pattern Making");

        // 4th Semester
        mechanicalSubjects.put("67041", "Engineering Mechanics");
        mechanicalSubjects.put("67042", "Metallurgy");
        mechanicalSubjects.put("67043", "Machine Shop Practice‐3");
        mechanicalSubjects.put("66743", "Electrical Circuits & Machines");
        mechanicalSubjects.put("69054", "Environmental Studies");
        mechanicalSubjects.put("66631", "Programming Essentials");
        mechanicalSubjects.put("65841", "Business Organization & Communication");

        // 5th Semester
        mechanicalSubjects.put("67051", "Hydraulics & Hydraulic Machineries");
        mechanicalSubjects.put("67052", "Mechanical Estimating& Costing");
        mechanicalSubjects.put("67053", "Advance Welding‐1");
        mechanicalSubjects.put("67054", "CAD & CAM");
        mechanicalSubjects.put("67055", "Manufacturing Process");
        mechanicalSubjects.put("65851", "Accounting Theory & Practice");

        // 6th Semester
        mechanicalSubjects.put("67061", "Thermodynamics & Heat Engine");
        mechanicalSubjects.put("67062", "Mechanical Measurement & Metrology");
        mechanicalSubjects.put("67063", "Plant Engineering");
        mechanicalSubjects.put("67064", "The strength of Materials");
        mechanicalSubjects.put("67065", "Advance Welding‐2");
        mechanicalSubjects.put("65852", "Industrial Management");

        // 7th Semester
        mechanicalSubjects.put("67071", "Design of Machine Elements");
        mechanicalSubjects.put("67072", "Tool Design");
        mechanicalSubjects.put("67073", "Heat Treatment of Metal");
        mechanicalSubjects.put("67074", "Mechanical Engineering Project");
        mechanicalSubjects.put("67075", "Production Planning & Control");
        mechanicalSubjects.put("67076", "Mechatronics & PLC");
        mechanicalSubjects.put("65853", "Innovation & Entrepreneurship");

        // Displaying the HashMap
        System.out.println("HashMap for Mechanical Technology Subjects:");
        for (String key : mechanicalSubjects.keySet()) {
            System.out.println("Subject Code: " + key + ", Subject Name: " + mechanicalSubjects.get(key));
        }
    }
}


import java.util.HashMap;

public class PowerTechnologySubjects {
    public static void main(String[] args) {
        HashMap<String, String> powerSubjects = new HashMap<>();

        // 1st Semester
        powerSubjects.put("67111", "Power Engineering Fundamentals");
        powerSubjects.put("61011", "Engineering Drawing");
        powerSubjects.put("65711", "Bangla");
        powerSubjects.put("65712", "English");
        powerSubjects.put("65911", "Mathematics‐1");
        powerSubjects.put("65912", "Physics‐1");

        // 2nd Semester
        powerSubjects.put("67121", "Workshop Safety & Management");
        powerSubjects.put("66711", "Basic Electricity");
        powerSubjects.put("65922", "Physics‐2");
        powerSubjects.put("65722", "Communicative English");
        powerSubjects.put("65921", "Mathematics‐2");
        powerSubjects.put("65812", "Physical Education & life skill development");

        // 3rd Semester
        powerSubjects.put("67131", "Engineering Thermodynamics");
        powerSubjects.put("67033", "Machine Shop Practice");
        powerSubjects.put("66611", "Computer application");
        powerSubjects.put("65931", "Mathematics‐3");
        powerSubjects.put("65913", "Chemistry");
        powerSubjects.put("65811", "Social Science");
        powerSubjects.put("66822", "Electronic Engineering Fundamentals");

        // 4th Semester
        powerSubjects.put("67141", "Engine Details");
        powerSubjects.put("67041", "Engineering Mechanics");
        powerSubjects.put("67142", "Automotive Suspension, Brake, Steering & Transmission system");
        powerSubjects.put("67143", "Fuels & Lubricants");
        powerSubjects.put("66743", "Electrical Circuits & Machine");
        powerSubjects.put("65841", "Business Organization & Communication");

        // 5th Semester
        powerSubjects.put("67151", "Power plant engineering");
        powerSubjects.put("67152", "Boiler operation and maintenance");
        powerSubjects.put("66271", "Service Station Operation & Estimating");
        powerSubjects.put("67153", "Engine Overhauling and Inspection");
        powerSubjects.put("65851", "Accounting Theory & practice");
        powerSubjects.put("69054", "Environmental Studies");

        // 6th Semester
        powerSubjects.put("67161", "Engine Testing & Performance");
        powerSubjects.put("66274", "Vehicle Automation & Signaling");
        powerSubjects.put("66241", "Automotive Body Building");
        powerSubjects.put("67162", "Fluid Mechanics & Machinery");
        powerSubjects.put("66764", "Transmission & Distribution of Electrical Power");
        powerSubjects.put("65852", "Industrial Management");

        // 7th Semester
        powerSubjects.put("67171", "Auto Electricity & Electronic");
        powerSubjects.put("67172", "Automobile Trouble Shooting & Driving");
        powerSubjects.put("67173", "Power Engineering Project");
        powerSubjects.put("66253", "Automobile Air‐conditioning");
        powerSubjects.put("66773", "Switch Gear & Protection");
        powerSubjects.put("65853", "Innovation & Entrepreneurship");

        // Displaying the HashMap
        System.out.println("HashMap for Power Technology Subjects:");
        for (String key : powerSubjects.keySet()) {
            System.out.println("Subject Code: " + key + ", Subject Name: " + powerSubjects.get(key));
        }
    }
}




