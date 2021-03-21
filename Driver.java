import java.util.Scanner;

	public class Driver {

		public static void main(String[] args) {

	        Scanner keyboard = new Scanner(System.in);

	        SudokuBoard s = new SudokuBoard();
	        SudokuSolver e0 = new SudokuSolver(s.getEasyboard());
	        SudokuSolver e1 = new SudokuSolver(s.getEasyboard1());
	        SudokuSolver e2 = new SudokuSolver(s.getEasyboard2());
	        SudokuSolver e3 = new SudokuSolver(s.getEasyboard3());
	        SudokuSolver m0 = new SudokuSolver(s.getMediumboard());
	        SudokuSolver m1 = new SudokuSolver(s.getMediumboard1());
	        SudokuSolver m2 = new SudokuSolver(s.getMediumboard2());
	        SudokuSolver m3 = new SudokuSolver(s.getMediumboard3());
	        SudokuSolver h0 = new SudokuSolver(s.getHardboard());
	        SudokuSolver h1 = new SudokuSolver(s.getHardboard1());
	        SudokuSolver h2 = new SudokuSolver(s.getHardboard2());
	        SudokuSolver h3 = new SudokuSolver(s.getHardboard3());
	        SudokuSolver e0afk = new SudokuSolver(s.getEasyboardafk());
	        SudokuSolver e1afk = new SudokuSolver(s.getEasyboardafk1());
	        SudokuSolver eafk2 = new SudokuSolver(s.getEasyboardafk2());
	        SudokuSolver eafk3 = new SudokuSolver(s.getEasyboardafk3());
	        SudokuSolver mafk0 = new SudokuSolver(s.getMediumboardafk());
	        SudokuSolver mafk1 = new SudokuSolver(s.getMediumboardafk1());
	        SudokuSolver mafk2 = new SudokuSolver(s.getMediumboardafk2());
	        SudokuSolver mafk3 = new SudokuSolver(s.getMediumboardafk3());
	        SudokuSolver hafk0 = new SudokuSolver(s.getHardboardafk());
	        SudokuSolver hafk1 = new SudokuSolver(s.getHardboardafk1());
	        SudokuSolver hafk2 = new SudokuSolver(s.getHardboardafk2());
	        SudokuSolver hafk3 = new SudokuSolver(s.getHardboardafk3());


	        System.out.println("Choose a difficulty(easy,medium,hard) and number(0,1,2,3)");
	        String difficulty = keyboard.next();
	        int choosingnumber = keyboard.nextInt();
	       

	        if (difficulty.equalsIgnoreCase("easy") && choosingnumber == 0) {
	           System.out.println(e0.toString(s.getEasyboard()));
	            while (true) {

	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                   System.out.println( e0afk.toString(s.getEasyboardafk()));

	                    System.out.println("You are now leaving ...");

	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();
	                        e0.solve();

	                         if(e0afk.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }
	                        else if (e0.board[row - 1][col - 1] == number) {
	                        	System.out.println();
	                            System.out.println("Correct");
	                            s.easyboardafk[row - 1][col - 1] = number;
	                            
	                            
                              System.out.println();
	                          System.out.println(  e0afk.toString(s.getEasyboardafk()));
	                           
	                          
	                          if(isSolved(e0afk)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }

	                        } 
	                        
	                        else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }

	                    } catch (Exception e) {
	                        System.out.println("unknown command...");
	                    }
	                }
	            }
	        } else if (difficulty.equalsIgnoreCase("easy") && choosingnumber == 1) {
	            System.out.println(e1.toString(s.getEasyboard1()));
	            while (true) {
	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                  System.out.println(e1afk.toString(s.getEasyboardafk1()));

	                    System.out.println("You are now leaving ...");
	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();

	                        e1.solve();
	                       
	                        if(e1afk.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }
	                        else if (e1.board[row - 1][col - 1] == number) {
	                        	System.out.println();
	                            System.out.println("Correct");
	                            System.out.println();
	                            s.easyboardafk1[row - 1][col - 1] = number;
	                            System.out.println();
	                            System.out.println(e1afk.toString(s.getEasyboardafk1()));
	                            if(isSolved(e1afk)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }

	                        } else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Unknown command...");
	                    }
	                }
	            }
	        } else if (difficulty.equalsIgnoreCase("easy") && choosingnumber == 2) {
	            System.out.println(e2.toString(s.getEasyboard2()));
	            while (true) {
	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                    System.out.println(eafk2.toString(s.getEasyboardafk2()));

	                    System.out.println("You are now leaving ...");
	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();
	                        e2.solve();
	                        
	                        if(eafk2.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }
	                        else if (e2.board[row - 1][col - 1] == number) {
	                        	System.out.println();
	                            System.out.println("Correct");
	                            System.out.println();
	                            s.easyboardafk2[row - 1][col - 1] = number;

	                            System.out.println(eafk2.toString(s.getEasyboardafk2()));
	                            if(isSolved(eafk2)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }

	                        } else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Unknown command...");
	                    }
	                }
	            }
	        } else if (difficulty.equalsIgnoreCase("easy") && choosingnumber == 3) {
	            System.out.println(e3.toString(s.getEasyboard3()));
	            while (true) {
	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                    System.out.println(eafk3.toString(s.getEasyboard3()));

	                    System.out.println("You are now leaving ...");
	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();
	                        e3.solve();
	                        if(eafk3.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }
	                        else if (e3.board[row - 1][col - 1] == number) {
	                        	System.out.println();
	                            System.out.println("correct");
	                            System.out.println();
	                            s.easyboardafk3[row - 1][col - 1] = number;
	                            System.out.println(eafk3.toString(s.getEasyboardafk3()));

	                            if(isSolved(eafk3)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }
	                        } else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Unknown command...");
	                    }
	                }
	            }
	        } else if (difficulty.equalsIgnoreCase("medium") && choosingnumber == 0) {
	            System.out.println(m0.toString(s.getMediumboard()));
	            while (true) {
	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                    System.out.println(mafk0.toString(s.getMediumboardafk()));

	                    System.out.println("You are now leaving ...");
	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();
	                        m0.solve();
	                        
	                        if(mafk0.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }
	                        else if (m0.board[row - 1][col - 1] == number) {
	                        	System.out.println();
	                            System.out.println("Correct");
	                            System.out.println();
	                            s.mediumboardafk[row - 1][col - 1] = number;
	                            System.out.println(mafk0.toString(s.getMediumboardafk()));

	                            if(isSolved(mafk0)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }
	                        } else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Unknown command...");
	                    }
	                }
	            }
	        } else if (difficulty.equalsIgnoreCase("medium") && choosingnumber == 1) {
	            System.out.println(m1.toString(s.getMediumboard1()));
	            while (true) {
	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                   System.out.println( mafk1.toString(s.getMediumboardafk1()));

	                    System.out.println("You are now leaving ...");
	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();
	                        m1.solve();
	                        
	                        if(mafk1.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }
	                        else if (m1.board[row - 1][col - 1] == number) {
	                        	System.out.println();
	                            System.out.println("Correct");
	                            System.out.println();
	                            s.mediumboardafk1[row - 1][col - 1] = number;
	                           System.out.println(mafk1.toString(s.getMediumboardafk1()));

	                            if(isSolved(mafk1)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }
	                        } else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Unknown command...");
	                    }
	                }
	            }
	        } else if (difficulty.equalsIgnoreCase("medium") && choosingnumber == 2) {
	            System.out.println(m2.toString(s.getMediumboard2()));
	            while (true) {
	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                    System.out.println(mafk2.toString(s.getMediumboardafk2()));

	                    System.out.println("You are now leaving ...");
	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();
	                        m2.solve();
	                        if(mafk2.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }
	                        else if (m2.board[row - 1][col - 1] == number) {
	                        	System.out.println();
	                            System.out.println("Correct");
	                            System.out.println();
	                            s.mediumboardafk2[row - 1][col - 1] = number;
	                            System.out.println(mafk2.toString(s.getMediumboardafk2()));

	                            if(isSolved(mafk2)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }

	                        } else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Unknown command...");
	                    }
	                }
	            }
	        } else if (difficulty.equalsIgnoreCase("medium") && choosingnumber == 3) {
	            System.out.println(m3.toString(s.getMediumboard3()));
	            while (true) {
	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                    System.out.println(mafk3.toString(s.getMediumboardafk3()));

	                    System.out.println("You are now leaving ...");
	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();
	                        m3.solve();
	                        if(mafk3.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }
	                        else if (m3.board[row - 1][col - 1] == number) {
	                        	System.out.println();
	                            System.out.println("Correct");
	                            System.out.println();
	                            s.mediumboardafk3[row - 1][col - 1] = number;
	                            System.out.println(mafk3.toString(s.getMediumboardafk3()));

	                            if(isSolved(mafk2)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }

	                        } else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Unknown command...");
	                    }
	                }
	            }
	        } else if (difficulty.equalsIgnoreCase("hard") && choosingnumber == 0) {
	            System.out.println(h0.toString(s.getHardboard()));
	            while (true) {
	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                    System.out.println(hafk0.toString(s.getHardboardafk()));

	                    System.out.println("You are now leaving ...");
	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();
	                        h0.solve();
	                        if(hafk0.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }
	                        else if (h0.board[row - 1][col - 1] == number) {
	                        	System.out.println();
	                            System.out.println("Correct");
	                            System.out.println();
	                            s.hardboardafk[row - 1][col - 1] = number;
	                           System.out.println(hafk0.toString(s.getHardboardafk()));

	                            if(isSolved(hafk0)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }
	                        } else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Unknown command...");
	                    }
	                }
	            }
	        } else if (difficulty.equalsIgnoreCase("hard") && choosingnumber == 1) {
	            System.out.println(h1.toString(s.getHardboard1()));
	            while (true) {
	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                    System.out.println(hafk1.toString(s.getHardboardafk1()));

	                    System.out.println("You are now leaving ...");
	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();
	                        h1.solve();
	                      
	                        if(mafk1.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }
	                        else if (h1.board[row - 1][col - 1] == number) {
	                        	System.out.println();
	                            System.out.println("Correct");
	                            System.out.println();
	                            s.hardboardafk1[row - 1][col - 1] = number;
	                            System.out.println(hafk1.toString(s.getHardboardafk1()));

	                            if(isSolved(hafk1)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }
	                        } else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Unknown command...");
	                    }
	                }
	            }
	        } else if (difficulty.equalsIgnoreCase("hard") && choosingnumber == 2) {
	            System.out.println(h2.toString(s.getHardboard2()));
	            while (true) {
	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                    System.out.println(hafk2.toString(s.getHardboardafk2()));

	                    System.out.println("You are now leaving ...");
	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();
	                        h2.solve();
	                        
	                        if(hafk2.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }else if (h2.board[row - 1][col - 1] == number) {
	                        	  System.out.println();
	                            System.out.println("Correct");
	                            System.out.println();
	                            s.hardboardafk2[row - 1][col - 1] = number;
	                           System.out.println(hafk2.toString(s.getHardboardafk2()));

	                            if(isSolved(hafk2)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }
	                        } else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Unknown command...");
	                    }
	                }
	            }
	        } else if (difficulty.equalsIgnoreCase("hard") && choosingnumber == 3) {
	            System.out.println(h3.toString(s.getHardboard3()));
	            while (true) {
	                System.out.println("If you want to leave the game, type exit");
	                System.out.println("If you want to enter a number in the board, press enter colum number:");

	                //System.out.println("Enter column number: ");
	                String column = keyboard.next();

	                if (column.equalsIgnoreCase("exit")) {
	                    System.out.println("You have partially solved board. You can see your progress: ");

	                    System.out.println(hafk3.toString(s.getHardboardafk3()));

	                    System.out.println("You are now leaving ...");
	                    System.exit(0);
	                } else {
	                    try {
	                        int col = Integer.parseInt(column);
	                        System.out.println("Enter row number: ");
	                        int row = keyboard.nextInt();
	                        System.out.println("Enter the number you want to put in: ");
	                        int number = keyboard.nextInt();
	                        h3.solve();
	                        if(hafk3.board[row-1][col-1]!=0) {
	                        	  System.out.println("You cannot change this number.");
	                          }
	                        else if (h3.board[row - 1][col - 1] == number) {
	                        	System.out.println();
	                            System.out.println("Correct");
	                            System.out.println();
	                            s.hardboardafk3[row - 1][col - 1] = number;
	                            System.out.println(hafk3.toString(s.getHardboardafk3()));

	                            if(isSolved(hafk3)){
	                                System.out.println("Congraaats!");
	                                System.out.println("You made it, clap clap!");
	                                System.exit(0);
	                            }
	                        } else {
	                            System.out.println("The number you entered is not correct. Please try again!");
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Unknown command...");
	                    }

	                }
	            }
	        }
	    }

	    public static boolean isSolved(SudokuSolver ss) {

	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	                if (ss.board[i][j] == 0) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}

