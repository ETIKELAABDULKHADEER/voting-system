package khadeer;

//public class VotingSystem {
	import java.util.Scanner;

	public class VotingSystem {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Initialize the vote counts for each candidate
	        int votesForCandidate1 = 0;
	        int votesForCandidate2 = 0;
	        int votesForCandidate3 = 0;

	        System.out.println("Voting System");
	        System.out.println("Enter the number of votes:");
	        int numberOfVotes = scanner.nextInt();

	        // Collect votes
	        for (int i = 1; i <= numberOfVotes; i++) {
	            System.out.println("Vote #" + i + ": Enter 1 for Candidate 1, 2 for Candidate 2, 3 for Candidate 3");
	            int vote = scanner.nextInt();

	            switch (vote) {
	                case 1:
	                    votesForCandidate1++;
	                    break;
	                case 2:
	                    votesForCandidate2++;
	                    break;
	                case 3:
	                    votesForCandidate3++;
	                    break;
	                default:
	                    System.out.println("Invalid vote. Please enter 1, 2, or 3.");
	                    i--; // Decrement i to repeat the iteration for valid input
	            }
	        }

	        // Determine the winner
	        int maxVotes = Math.max(votesForCandidate1, Math.max(votesForCandidate2, votesForCandidate3));
	        if (votesForCandidate1 == maxVotes && votesForCandidate2 == maxVotes && votesForCandidate3 == maxVotes) {
	            System.out.println("It's a tie among all candidates!");
	        } else if (votesForCandidate1 == maxVotes && votesForCandidate2 == maxVotes) {
	            System.out.println("It's a tie between Candidate 1 and Candidate 2!");
	        } else if (votesForCandidate1 == maxVotes && votesForCandidate3 == maxVotes) {
	            System.out.println("It's a tie between Candidate 1 and Candidate 3!");
	        } else if (votesForCandidate2 == maxVotes && votesForCandidate3 == maxVotes) {
	            System.out.println("It's a tie between Candidate 2 and Candidate 3!");
	        } else if (votesForCandidate1 == maxVotes) {
	            System.out.println("Candidate 1 wins with " + votesForCandidate1 + " votes!");
	        } else if (votesForCandidate2 == maxVotes) {
	            System.out.println("Candidate 2 wins with " + votesForCandidate2 + " votes!");
	        } else {
	            System.out.println("Candidate 3 wins with " + votesForCandidate3 + " votes!");
	        }

	        scanner.close();
	    }
	}


