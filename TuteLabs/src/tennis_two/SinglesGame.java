package tennis_two;

public class SinglesGame extends SerialContest implements Game {

	public SinglesGame(Player firstServer, int targetScore, int advantage) {
		super(firstServer, targetScore, advantage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContestName() {
		return "SinglesGame";
	}

	@Override
	protected Contest makeSubContest() {
		return TennisFactory.instance().makePoint(firstServer);
	}

	@Override
    public String scoreAsString (Player player)
    {
		return Integer.toString (Math.min(15 * score (player), 40));
    }
	
/*
	@Override
    protected void onSubContestOver ()
    {
        Player subWinner = currentSubContest.winner ();
        assert players ().has (subWinner);
        
        if (players ()._1.equals (subWinner)) {
        	score_1+=15;
        	score_1=Math.min(40, score_1);
        } else {
        	score_2+=15;
    		score_2=Math.min(40, score_2);
        }

        display ();
    }
*/
}
