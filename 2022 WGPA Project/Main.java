import java.util.*;
//previous name was WGPA_Project
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Weighted GPA Calulcator, made specifically for WWP High School Students");
        System.out.println("(made by Zeeshan Shariff)");
        userValues userValues = new userValues();
        goToMenu(userValues);
        

    } //ends main


  //Functions Related to Menu UI
    static void goToMenu(userValues userValues) {
        System.out.println("Type in the number of the category you want to go to and press Enter (Ex: '2' to add a Comp Sci Course) \n");
        System.out.println("1 - Add an Art Course");
        System.out.println("2 - Add a Business/Comp Sci. Course");
        System.out.println("3 - Add a Dance Course");
        System.out.println("4 - Add an Engineering Course");
        System.out.println("5 - Add a Family and Consumer Science Course");
        System.out.println("6 - Add a Health/Phys Ed Course");
        System.out.println("7 - Add a Language Arts Course");
        System.out.println("8 - Add a Math Course");
        System.out.println("9 - Add a Media Course");
        System.out.println("10 - Add a Music Course");
        System.out.println("11 - Add a Science Course");
        System.out.println("12 - Add a Social Studies Course");
        System.out.println("13 - Add a Theatre Course");
        System.out.println("14 - Add a World Language Course");
        System.out.println("15 - Calculate my Weighted GPA! (Do this once you have added courses)");
        Scanner input = new Scanner(System.in);
        int page = (int)input.nextInt();
        if(page == 1) {
            artCourse(userValues);
        } 
        if(page == 2) {
          businessCourse(userValues);
        }
        if(page == 3) {
          danceCourse(userValues);
        }
        if(page == 4) {
          engineeringCourse(userValues);
        }
        if(page == 5) {
          familyCourse(userValues);
        }
        if(page == 6) {
          healthCourse(userValues);
        }
        if(page == 7) {
          laCourse(userValues);
        }
        if(page == 8) {
          mathCourse(userValues);
        }
        if(page == 9) {
          mediaCourse(userValues);
        }
        if(page == 10) {
          musicCourse(userValues);
        }
        if(page == 11) {
          scienceCourse(userValues);
        }
        if(page == 12) {
          socialCourse(userValues);
        }
        if(page == 13) {
          theatreCourse(userValues);
        }
        if(page == 14) {
          languageCourse(userValues);
        }
 
        if(page == 15) {
          userValues.calculateWGPA(userValues.qualityPoints, userValues.creditTotal);
        }
        if(page<1 || page> 15) {
          System.out.println("Invalid input, enter a number in the range");
          goToMenu(userValues);
        }

    } //ends Menu Function

    static void artCourse(userValues userValues) {
        System.out.println("\n Select the Art Course you want to add \n");
        System.out.println("1 - Art Foundation");
        System.out.println("2 - Drawing & Painting I");
        System.out.println("3 - Drawing & Painting II (CP)");
        System.out.println("4 - Drawing & Painting II Honors");
        System.out.println("5 - Sculpture & Ceramics");
        System.out.println("6 - Printmaking");
        System.out.println("7 - Computer Art & Design I");
        System.out.println("8 - Computer Art & Design II");
        System.out.println("9 - Photography I");
        System.out.println("10 - Photography II");
        System.out.println("11 - AP Studio Art");
        System.out.println("12 - AP Art History");
        System.out.println("13 - Back to Menu");
        Scanner artInput = new Scanner(System.in);
        int artCourse = (int)artInput.nextInt();
        if(artCourse == 1 || artCourse == 2 || artCourse == 3 || artCourse == 5 || artCourse == 6 ||artCourse == 7 || artCourse == 8 || artCourse == 9 || artCourse == 10) {
            userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
            userValues.creditTotal = userValues.creditTotal + 5;
            afterCourse(userValues);
        }
        if(artCourse == 4 || artCourse == 11 || artCourse == 12) {
            userValues.qualityPoints = userValues.qualityPoints + userValues.getHonorsQualityPoints(5);
            userValues.creditTotal = userValues.creditTotal + 5;
            afterCourse(userValues);
        }
        if(artCourse == 13) {
            goToMenu(userValues);
            
        }
        if(!(artCourse > 0) || !(artCourse < 14)) {
            System.out.println("Not a valid input, please type in a number in the list");
            artCourse(userValues);
        }
    } //ends Art Class Function

    static void businessCourse(userValues userValues) {
      System.out.println("\n Select the Business/CompSci Course you want to add");
      System.out.println("1 - Accounting");
      System.out.println("2 - Marketing");
      System.out.println("3 - Digital Communication");
      System.out.println("4 - Emerging Financial Markets (CP Credit)");
      System.out.println("5 - Emerging Financial Markets (Honors Credit)");
      System.out.println("6 - Financial Literacy");
      System.out.println("7 - Digital Media");
      System.out.println("8 - Introduction to Computer Science & Mobile App/Game Design");
      System.out.println("9 - AP Computer Science A");
      System.out.println("10 - AP Computer Science Principles");
      System.out.println("11 - Advanced Topics in Computer Science Honors");
      System.out.println("12 - Back to Menu");
      Scanner businessInput = new Scanner(System.in);
      int businessCourse = (int)businessInput.nextInt();
      if(businessCourse == 1 || businessCourse == 2 || businessCourse == 3 || businessCourse == 4 || businessCourse == 7 || businessCourse == 8) {
        userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
            userValues.creditTotal = userValues.creditTotal + 5;
            afterCourse(userValues);
      }
      if(businessCourse == 5 || businessCourse == 9 || businessCourse == 10 || businessCourse == 11) {
        userValues.qualityPoints = userValues.qualityPoints + userValues.getHonorsQualityPoints(5);
            userValues.creditTotal = userValues.creditTotal + 5;
            afterCourse(userValues);
      }
      if(businessCourse == 6) {
        userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(2.5);
            userValues.creditTotal = userValues.creditTotal + 2.5;
            afterCourse(userValues);
      }
      if(businessCourse == 12) {
            goToMenu(userValues);
            
        }
      if(!(businessCourse > 0) || !(businessCourse < 13)) {
          System.out.println("Not a valid input, please type in a number in the list");
          businessCourse(userValues);
        }
    } //ends Business Menu

  static void danceCourse(userValues userValues) {
    System.out.println("\n Select the Dance course you want to add");
    System.out.println("1 - Dance I");
    System.out.println("2 - Back to Menu");
    Scanner danceInput = new Scanner(System.in);
    int danceCourse = (int)danceInput.nextInt();
    if(danceCourse == 1) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(danceCourse == 2) {
      goToMenu(userValues);
    }
    if(!(danceCourse == 1) && !(danceCourse == 2)) {
      System.out.println("Not a valid input, please type in a number in the list");
      danceCourse(userValues);
    }
  } //ends Dance Menu

  static void engineeringCourse(userValues userValues) {
    System.out.println("\n Select the Engineering course you want to add");
    System.out.println("1 - Principles of Engineering");
    System.out.println("2 - Graphic Engineering");
    System.out.println("3 - Engineering Design and Fabrication");
    System.out.println("4 - Robotics Engineering");
    System.out.println("5 - Back to Menu");
    Scanner engineeringInput = new Scanner(System.in);
    int engineeringCourse = (int)engineeringInput.nextInt();
    if(engineeringCourse == 1 || engineeringCourse == 2 || engineeringCourse == 3 || engineeringCourse == 4) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(engineeringCourse == 5) {
      goToMenu(userValues);
    }
    if(!(engineeringCourse > 0) || !(engineeringCourse<6)) {
      System.out.println("Not a valid input, please type in a number in the list");
      engineeringCourse(userValues);
    }
  } //ends Engineering menu

  static void familyCourse(userValues userValues) {
    System.out.println("\n Select the Family and Consumer Science course you want to add");
    System.out.println("1 - Creative Design");
    System.out.println("2 - Advanced Creative Design");
    System.out.println("3 - Culinary Arts");
    System.out.println("4 - International Foods");
    System.out.println("5 - Creative Cooking and Catering");
    System.out.println("6 - Child Growth and Development");
    System.out.println("Youth Teaching Youth Unavailable due to Pass/Fail system not affecting WGPA");
    System.out.println("7 - Back to Menu");
    Scanner familyInput = new Scanner(System.in);
    int familyCourse = (int)familyInput.nextInt();
    if(familyCourse == 1 || familyCourse == 2 || familyCourse == 3 || familyCourse == 4 || familyCourse == 5 || familyCourse == 6) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(familyCourse == 7) {
      goToMenu(userValues);
    }
    if(!(familyCourse > 0) || !(familyCourse<8)) {
      System.out.println("Not a valid input, please type in a number in the list");
      familyCourse(userValues);
    }
  } //ends Family Menu

  
  static void healthCourse(userValues userValues) {
    System.out.println("\n Select the Phys.Ed/Health Course you want to add [Phys. Ed does not affect WGPA]");
    System.out.println("1 - 9th Grade Health Ed.");
    System.out.println("2 - 11th Grade Health Ed.");
    System.out.println("3 - 12th Grade Health Ed.");
    System.out.println("4 - 10th Grade Drivers Ed.");
    System.out.println("5 - Fundamentals of Sports Medicine");
    System.out.println("6 - Back to Menu");
    Scanner healthInput = new Scanner(System.in);
    int healthCourse = (int)healthInput.nextInt();
    if(healthCourse == 1 || healthCourse == 2 || healthCourse == 3 || healthCourse == 4) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(1.25);
      userValues.creditTotal = userValues.creditTotal + 1.25;
      afterCourse(userValues);
    }
    if(healthCourse == 5) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(healthCourse == 6) {
      goToMenu(userValues);
    }
    if(!(healthCourse > 0) || !(healthCourse < 7)) {
      System.out.println("Not a valid input, please type in a number in the list");
      healthCourse(userValues);
      }
  } // ends health menu

  static void laCourse(userValues userValues) {
    System.out.println("\n Select the Language Arts Course you want to add");
    System.out.println("1 - Language Arts I");
    System.out.println("2 - Language Arts I Honors");
    System.out.println("3 - Language Arts II");
    System.out.println("4 - Language Arts II Honors");
    System.out.println("5 - Language Arts III");
    System.out.println("6 - Language Arts III Honors");
    System.out.println("7 - Language Arts IV");
    System.out.println("8 - Language Arts IV Honors");
    System.out.println("9 - AP Language and Composition");
    System.out.println("10 - AP Literature and Composition");
    System.out.println("11 - Back to Menu");
    Scanner laInput = new Scanner(System.in);
    int laCourse = (int)laInput.nextInt();
    if(laCourse == 1 || laCourse == 3 || laCourse == 5 || laCourse == 7) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(laCourse == 2 || laCourse == 4 || laCourse == 6 || laCourse == 8 || laCourse == 9 || laCourse == 10) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getHonorsQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(laCourse == 11) {
      goToMenu(userValues);
    }
    if(!(laCourse > 0) || !(laCourse < 12)) {
      System.out.println("Not a valid input, please type in a number in the list");
      laCourse(userValues);
      }
  } //ends LA Course Menu

  static void mathCourse(userValues userValues) {
    System.out.println("\n Select the Math Course you want to add");
    System.out.println("1 - Algebra I ");
    System.out.println("2 - Algebra II");
    System.out.println("3 - Advanced Algebra II");
    System.out.println("4 - Advanced Algebra II Honors");
    System.out.println("5 - Geometry");
    System.out.println("6 - Geometry Honors");
    System.out.println("7 - Geometry Honors and Accelerated");
    System.out.println("8 - Algebra and Trigonometry");
    System.out.println("9 - Pre-Calculus");
    System.out.println("10 - Pre-Calculus Honors [Select this if you took Pre-Calc H&A, H&A doesn't exist anymore]");
    System.out.println("11 - Calculus Honors");
    System.out.println("12 - AP Calculus AB");
    System.out.println("13 - AP Calculus BC");
    System.out.println("14 - Multivariable Calculus Honors");
    System.out.println("15 - Statistics");
    System.out.println("16 - AP Statistics");
    System.out.println("17 - Back to Menu");
    Scanner mathInput = new Scanner(System.in);
    int mathCourse = (int)mathInput.nextInt();
    if(mathCourse == 1 || mathCourse == 2 || mathCourse == 3 || mathCourse == 5 || mathCourse == 8 || mathCourse == 9 || mathCourse == 15) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(mathCourse == 4 || mathCourse == 6 || mathCourse == 7 || mathCourse == 10 || mathCourse == 11 || mathCourse == 12 || mathCourse == 13 || mathCourse == 14 || mathCourse == 16) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getHonorsQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(mathCourse == 17) {
      goToMenu(userValues);
    }
    if(!(mathCourse > 0) || !(mathCourse < 18)) {
      System.out.println("Not a valid input, please type in a number in the list");
      mathCourse(userValues);
      }
        
  } //ends Math Course

    static void mediaCourse(userValues userValues) {
      System.out.println("\n Select the Media Course you want to add");
      System.out.println("1 - Broadcast Writing");
      System.out.println("2 - Advanced Broadcast Writing I");
      System.out.println("3 - Advanced Broadcast Writing II");
      System.out.println("4 - TV Production");
      System.out.println("5 - Journalism");
      System.out.println("6 - Advanced Journalism Honors I");
      System.out.println("7 - Advanced Journalism Honors II");
      System.out.println("8 - Back to Menu");
      Scanner mediaInput = new Scanner(System.in);
      int mediaCourse = (int)mediaInput.nextInt();
      if(mediaCourse == 1 || mediaCourse == 2 || mediaCourse == 3 || mediaCourse == 4 || mediaCourse == 5) {
        userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
        userValues.creditTotal = userValues.creditTotal + 5;
        afterCourse(userValues);
      }
      if(mediaCourse == 6 || mediaCourse == 7) {
        userValues.qualityPoints = userValues.qualityPoints + userValues.getHonorsQualityPoints(5);
        userValues.creditTotal = userValues.creditTotal + 5;
        afterCourse(userValues);
      }
      if(mediaCourse == 8) {
        goToMenu(userValues);
      }
      if(!(mediaCourse > 0) || !(mediaCourse < 9)) {
      System.out.println("Not a valid input, please type in a number in the list");
      mediaCourse(userValues);
      }
    } //ends Media Menu

    static void musicCourse(userValues userValues) {
      System.out.println("\n Select the Music Course you want to add");
      System.out.println("1 - Music Theory I");
      System.out.println("2 - Music Theory II");
      System.out.println("3 - Music Technology");
      System.out.println("4 - Chorale");
      System.out.println("5 - Concert Choir");
      System.out.println("6 - Concert Choir Honors");
      System.out.println("7 - Chamber Choir (Honors)");
      System.out.println("8 - Concert Band");
      System.out.println("9 - Symphonic Band");
      System.out.println("10 - Symphonic Band Honors");
      System.out.println("11 - Wind Ensemble (Honors)");
      System.out.println("12 - String Ensemble");
      System.out.println("13 - Symphony Orchestra");
      System.out.println("14 - Symphony Orchestra Honors");
      System.out.println("15 - Philharmonic Orchestra (Honors)");
      System.out.println("16 - Back to Menu");
      Scanner musicInput = new Scanner(System.in);
      int musicCourse = (int)musicInput.nextInt();
      if(musicCourse == 1 || musicCourse == 2 || musicCourse == 3 || musicCourse == 4 || musicCourse == 5 || musicCourse == 8 || musicCourse == 9 || musicCourse == 12 || musicCourse == 13) {
        userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
        userValues.creditTotal = userValues.creditTotal + 5;
        afterCourse(userValues);
      }
      if(musicCourse == 6 || musicCourse == 7 || musicCourse == 10 || musicCourse == 11 || musicCourse == 14 || musicCourse == 15) {
        userValues.qualityPoints = userValues.qualityPoints + userValues.getHonorsQualityPoints(5);
        userValues.creditTotal = userValues.creditTotal + 5;
        afterCourse(userValues);
      }
      if(musicCourse == 16) {
        goToMenu(userValues);
      }
      if(!(musicCourse > 0) || !(musicCourse < 17)) {
      System.out.println("Not a valid input, please type in a number in the list");
      musicCourse(userValues);
      }
    } //ends Music Course

    static void scienceCourse(userValues userValues) {
      System.out.println("\n Select the Science Course you want to add");
      System.out.println("1 - Biology");
      System.out.println("2 - Biology Honors");
      System.out.println("3 - AP Biology");
      System.out.println("4 - Chemistry");
      System.out.println("5 - Chemistry Honors");
      System.out.println("6 - AP Chemistry");
      System.out.println("7 - Physics");
      System.out.println("8 - Physics Honors");
      System.out.println("9 - Advanced Topics in Physics Honors");
      System.out.println("10 - Environmental Science");
      System.out.println("11 - Forensic Science");
      System.out.println("12 - Human Anatomy & Physiology");
      System.out.println("13 - AP Environmental Science");
      System.out.println("14 - Descriptive Astronomy");
      System.out.println("15 - Genetics");
      System.out.println("16 - Back to Menu");
      Scanner scienceInput = new Scanner(System.in);
      int scienceCourse = (int)scienceInput.nextInt();
      if(scienceCourse == 1 || scienceCourse == 4 || scienceCourse == 7 || scienceCourse == 10 || scienceCourse == 11 || scienceCourse == 12 || scienceCourse == 14 || scienceCourse == 15) {
        userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
        userValues.creditTotal = userValues.creditTotal + 5;
        afterCourse(userValues);
      }
      if(scienceCourse == 2 || scienceCourse == 5 || scienceCourse == 8) {
        userValues.qualityPoints = userValues.qualityPoints + userValues.getHonorsQualityPoints(5);
        userValues.creditTotal = userValues.creditTotal + 5;
        afterCourse(userValues);
      }
      if(scienceCourse == 3 || scienceCourse == 6 || scienceCourse == 9 || scienceCourse == 13) {
        userValues.qualityPoints = userValues.qualityPoints + userValues.getHonorsQualityPoints(7);
        userValues.creditTotal = userValues.creditTotal + 7;
        afterCourse(userValues);
      }
      if(scienceCourse == 16) {
        goToMenu(userValues);
      }
      if(!(scienceCourse > 0) || !(scienceCourse < 17)) {
      System.out.println("Not a valid input, please type in a number in the list");
      scienceCourse(userValues);
    }
  } //ends Science Menu

  static void socialCourse(userValues userValues) {
    System.out.println("\n Select the Social Studies Course you want to add");
    System.out.println("1 - World History");
    System.out.println("2 - World History Honors");
    System.out.println("3 - American Studies I");
    System.out.println("4 - American Studies I Honors");
    System.out.println("5 - American Studies II");
    System.out.println("6 - American Studies II Honors");
    System.out.println("7 - International Business and Cultures");
    System.out.println("8 - Human Behavior");
    System.out.println("9 - Legal and Political Experience (IPLE)");
    System.out.println("10 - Economics/Social Problems in American Society");
    System.out.println("11 - Social Justice: Race, Class, and Gender");
    System.out.println("12 - AP United States History");
    System.out.println("13 - AP European History");
    System.out.println("14 - AP American Government");
    System.out.println("15 - AP Comparative Government and Global Studies");
    System.out.println("16 - AP Psychology");
    System.out.println("17 - AP Microeconomics");
    System.out.println("18 - Student Research in the Social Sciences Honors");
    System.out.println("19 - Back to Menu");
    Scanner socialInput = new Scanner(System.in);
    int socialClass = (int)socialInput.nextInt();
    if(socialClass == 1 || socialClass == 3 || socialClass == 5 || socialClass == 7 || socialClass == 8 || socialClass == 9 || socialClass == 10 || socialClass == 11) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(socialClass == 2 || socialClass == 4 || socialClass == 6 || socialClass == 12 || socialClass == 13 || socialClass == 14 || socialClass == 15 || socialClass == 16 || socialClass == 17 || socialClass == 18) {
        userValues.qualityPoints = userValues.qualityPoints + userValues.getHonorsQualityPoints(5);
        userValues.creditTotal = userValues.creditTotal + 5;
        afterCourse(userValues);
    }
    if(socialClass == 19) {
      goToMenu(userValues);
    }
    if(!(socialClass > 0) || !(socialClass < 20)) {
      System.out.println("Not a valid input, please type in a number in the list");
      socialCourse(userValues);
  }
} //ends Social

  static void theatreCourse(userValues userValues) {
    System.out.println("\n Select the Theatre Course you want to add");
    System.out.println("1 - Theatre Arts");
    System.out.println("2 - Back to Menu");
    Scanner theatreInput = new Scanner(System.in);
    int theatreCourse = (int)theatreInput.nextInt();
    if(theatreCourse == 1) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(theatreCourse == 2) {
      goToMenu(userValues);
    }
    if(!(theatreCourse > 0) || !(theatreCourse < 3)) {
      System.out.println("Not a valid input, please type in a number in the list");
      theatreCourse(userValues);
  }
} //ends Theatre Menu

  static void languageCourse(userValues userValues) {
    System.out.println("\n Select the World Language Course you want to add");
    System.out.println("1 - An Intro to Spanish Communication & Culture");
    System.out.println("2 - Spanish Language & Cultural Study");
    System.out.println("3 - Spanish I");
    System.out.println("4 - Spanish II");
    System.out.println("5 - Spanish III");
    System.out.println("6 - Spanish III Honors");
    System.out.println("7 - Spanish IV");
    System.out.println("8 - Spanish IV Honors");
    System.out.println("9 - Spanish V");
    System.out.println("10 - Conversations in Spanish");
    System.out.println("11 - Honors Spanish Cultural Studies");
    System.out.println("12 - AP Spanish Language");
    System.out.println("13 - AP Spanish Literature");
    System.out.println("14 - French I");
    System.out.println("15 - French II");
    System.out.println("16 - French III");
    System.out.println("17 - French III Honors");
    System.out.println("18 - French IV");
    System.out.println("19 - French IV Honors");
    System.out.println("20 - French V");
    System.out.println("21 - AP French Language");
    System.out.println("22 - German I");
    System.out.println("23 - German II");
    System.out.println("24 - German III");
    System.out.println("25 - German IV Honors");
    System.out.println("26 - German V Honors");
    System.out.println("27 - AP German Language");
    System.out.println("28 - Chinese I");
    System.out.println("29 - Chinese II");
    System.out.println("30 - Chinese III");
    System.out.println("31 - Chinese IV Honors");
    System.out.println("32 - Chinese V Honors");
    System.out.println("33 - AP Chinese Language");
    System.out.println("34 - Back to Menu");
    Scanner languageInput = new Scanner(System.in);
    int languageCourse = (int)languageInput.nextInt();
    if(languageCourse == 1 || languageCourse == 2 || languageCourse == 3 || languageCourse == 4 || languageCourse == 5 || languageCourse == 7 || languageCourse == 9 || languageCourse == 10 || languageCourse == 14 || languageCourse == 15 || languageCourse == 16 || languageCourse == 18 || languageCourse == 20 || languageCourse == 22 || languageCourse == 23 || languageCourse == 24 || languageCourse == 28 || languageCourse == 29 || languageCourse == 30) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(languageCourse == 6 || languageCourse == 8 || languageCourse == 11 || languageCourse == 12 || languageCourse == 13 || languageCourse == 17 || languageCourse == 19 || languageCourse == 21 || languageCourse == 25 || languageCourse == 26 || languageCourse == 27 || languageCourse == 31 || languageCourse == 32 || languageCourse == 33) {
      userValues.qualityPoints = userValues.qualityPoints + userValues.getHonorsQualityPoints(5);
      userValues.creditTotal = userValues.creditTotal + 5;
      afterCourse(userValues);
    }
    if(languageCourse == 34) {
      goToMenu(userValues);
    }
    if(!(languageCourse > 0) || !(languageCourse < 35)) {
      System.out.println("Not a valid input, please type in a number in the list");
      languageCourse(userValues);
  }
}

  
















  //Other Functions Below
    static int getRegGrade() {
        System.out.println("\n What was your overall/final grade in this course? (Enter Capital Letter i.e 'A')");
        Scanner regGradeInput = new Scanner(System.in);
        String regGrade = (String)regGradeInput.nextLine();
        if (regGrade.equals("A")) {
            return 4;
        }
        if (regGrade.equals("B")) {
            return 3;
        }
        if (regGrade.equals("C")) {
            return 2;
        }
        if (regGrade.equals("D")) {
            return 1;
        }
        if (regGrade.equals("F")) {
            return 0;
        }
        else {
            System.out.println("Not valid input, please enter a capital letter (i.e 'A')");
            return getRegGrade();
        } 
    }//ends Reg Grade Function

    static int getHonorsGrade() {
        System.out.println("\n What was your overall/final grade in this course? (Enter Capital Letter i.e 'A')");
        Scanner honorsGradeInput = new Scanner(System.in);
        String honorsGrade = (String)honorsGradeInput.nextLine();
        if (honorsGrade.equals("A")) {
            return 5;
        }
        if (honorsGrade.equals("B")) {
            return 4;
        }
        if (honorsGrade.equals("C")) {
            return 3;
        }
        if (honorsGrade.equals("D")) {
            return 2;
        }
        if (honorsGrade.equals("F")) {
            return 0;
        }
        else {
            System.out.println("Not valid input, please enter a capital letter (i.e 'A')");
            return getRegGrade();
        } 
    }//ends Honors Grade Function


    static int getQualityPoints(int credits) {
        int grade = getRegGrade();
        return (grade * credits);
    } //ends getQualityPoints function

    static int getHonorsQualityPoints(int credits) {
        int grade = getHonorsGrade();
        return (grade * credits);
    } //ends getHonorsQualityPoints function

    static void afterCourse(userValues userValues) {
                Scanner courseInput = new Scanner(System.in);
                String courseAnswer;
                System.out.println("\n Do you want to add another course [This will take you back to the menu]? (Enter 'Y' or 'N')");
                courseAnswer = (String)courseInput.nextLine();
                if(courseAnswer.equals("Y")) {
                    goToMenu(userValues);
                }
                if(!courseAnswer.equals("Y") && !courseAnswer.equals("N")) {
                    System.out.println("Invalid Answer, type 'Y' or 'N'");
                    afterCourse(userValues);
                }
                if(courseAnswer.equals("N")) {
                    userValues.calculateWGPA(userValues.qualityPoints, userValues.creditTotal);
                }
            
        } //ends afterCourse
  
    
    
}