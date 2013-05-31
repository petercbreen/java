/**
 * 
 */
package adventure.model;

import java.util.Arrays;

/**
 * @author jakobro
 * 
 */
public class ExampleStory {

	/**
	 * @return Returns a directed story graph.
	 */
	public static IStoryState getStory() {
		return new ChoiceState("Bist Du: " + "<ol>" + "<li>maennlich</li>"
				+ "<li>weiblich</li>" + "</ol>", Arrays.asList(createBoyStory(),
				createGirlStory()));
	}

	/**
	 * Creates a new story.
	 * 
	 * @return Returns a directed graph of IStoryState objects representing the
	 *         story.
	 */
	private static IStoryState createBoyStory() {
		/**
		 * Possible final states
		 */
		IStoryState happyEnd = new FinalState(
				"<p>Sie nimmt einen Keks und laechelt Dich kurz an.\n"
						+ "Zwei Stunden spaeter packt sie ihre Notizen ein und bricht auf. "
						+ "Du faengst sie am Kaffeeautomaten ab. Ein Wort gibt das andere. "
						+ "Noch am selben Abend tauscht Ihr PGP-Schluessel aus und richtet "
						+ "einander Accounts ein.</p>" + "<p>The End.</p>");
		
		IStoryState badEnd = new FinalState(
				"<p>Sie verdreht die Augen, packt ihren Rucksack und verlaesst den Pool.</p>"
						+ "<p>Das war wohl nichts.</p>");
		
		IStoryState tofuEnd = new FinalState(
				"<p>Das Essen schmeckt lecker. Ein Wort gibt das andere. "
						+ "Noch am selben Abend tauscht Ihr PGP-Schluessel aus und richtet "
						+ "einander Accounts ein.</p>" + "<p>The End.</p>");
		
		IStoryState stroganoffEnd = new FinalState(
				"<p>Das Stroganoff ist so zaeh, dass Du zwischendurch raus musst. "
						+ "Als Du wiederkommst ist sie weg...</p>"
						+ "<p>Das war wohl nichts.</p>");
		
		/**
		 * Possible choice states
		 */
		IStoryState mensa = new ChoiceState(
				"<p>Es gibt heute in der Mensa drei verschiedene Essen.</p>"
						+ "<ol>" + "<li>Rindergeschnetzeltes Stroganoff</li>"
						+ "<li>Tofuwurst</li>"
						+ "<li>Joghurt</li></ol> <p>Welches nimmst Du?</p>",
						Arrays.asList(stroganoffEnd, tofuEnd, tofuEnd));
		
		IStoryState s2 = new ChoiceState(
				"<p>Sie kneift kurz die Augen zu und runzelt die Stirn.</p>"
						+ "<p><pre>'C-u M-|'</pre>, sagt sie dann, laechelt kurz und wendet sich wieder ihrem Programm zu.</p>"
						+ "<ol><li>Du sagst 'Ich wusste gar nicht, dass Maedchen Emacs verwenden koennen.'</li>"
						+ "<li>Du bietest ihr einen von Deinen Keksen an.</li>"
						+ "<li>Du bietest ihr an in der Mensa Essen zu gehen an.</li>"
						+ "</ol>", Arrays.asList(badEnd, happyEnd, mensa));
		
		IStoryState s1 = new ChoiceState(
				"<p>Du sitzt im Pool. Eine auf eine nerdige Weise gutaussehende Studentin "
						+ "sitzt zwei Rechner weiter.</p>"
						+ "<ol><li>Du fragst sie, ob sie auswendig weiss, wie man im Emacs"
						+ "    eine Region durch ein Shell-Kommando pipet.</li>"
						+ "<li>Du fragst sie, ob ihr Vater ein Dieb ist, "
						+ "    denn im Himmel fehlen ein paar Sterne.</li></ol>",
						Arrays.asList(s2, badEnd));

		return s1;
	}

	/**
	 * Creates a new story.
	 * 
	 * @return Returns a directed graph of IStoryState objects representing the
	 *         story.
	 */
	private static IStoryState createGirlStory() {
		/**
		 * Possible final states
		 */
		IStoryState happyEnd = new FinalState(
				"<p>Er nimmt einen Keks und laechelt Dich kurz an.\n"
						+ "Zwei Stunden spaeter packt er seine Notizen ein und bricht auf. "
						+ "Du faengst ihn am Kaffeeautomaten ab. Ein Wort gibt das andere. "
						+ "Noch am selben Abend tauscht Ihr PGP-Schluessel aus und richtet "
						+ "einander Accounts ein.</p>" + "<p>The End.</p>");
		
		IStoryState badEnd = new FinalState(
				"<p>Er verdreht die Augen und geht.</p>"
						+ "<p>Das war wohl nichts.</p>");
		
		IStoryState tofuEnd = new FinalState(
				"<p>Das Essen schmeckt lecker. Ein Wort gibt das andere. "
						+ "Noch am selben Abend tauscht Ihr PGP-Schluessel aus und richtet "
						+ "einander Accounts ein.</p>" + "<p>The End.</p>");
		
		IStoryState stroganoffEnd = new FinalState(
				"<p>Das Stroganoff ist so zaeh, dass Du zwischendurch raus musst. "
						+ "Als Du wiederkommst ist er weg...</p>"
						+ "<p>Das war wohl nichts.</p>");
		
		
		/** 
		 * Possible choices
		 */
		IStoryState mensa = new ChoiceState(
				"<p>Es gibt heute in der Mensa drei verschiedene Essen.</p>"
						+ "<ol>" + "<li>Rindergeschnetzeltes Stroganoff</li>"
						+ "<li>Tofuwurst</li>"
						+ "<li>Joghurt</li></ol> <p>Welches nimmst Du?</p>",
						Arrays.asList(stroganoffEnd, tofuEnd, tofuEnd));
		
		IStoryState s2 = new ChoiceState(
				"<p>Er kneift kurz die Augen zu und runzelt die Stirn.</p>"
						+ "<p><pre>'C-u M-|'</pre>, sagt er dann, laechelt kurz und wendet sich wieder seinem Programm zu.</p>"
						+ "<ol><li>Du sagst 'Ich wusste gar nicht, dass Jungs Emacs verwenden koennen.'</li>"
						+ "<li>Du bietest ihm einen von Deinen Keksen an.</li>"
						+ "<li>Du bietest ihm an in der Mensa Essen zu gehen an.</li>"
						+ "</ol>", Arrays.asList(badEnd, happyEnd, mensa));
		
		IStoryState s1 = new ChoiceState(
				"<p>Du sitzt im Pool. Ein auf eine nerdige Weise gutaussehender Student "
						+ "sitzt zwei Rechner weiter.</p>"
						+ "<ol><li>Du fragst ihn, ob er auswendig weiss, wie man im Emacs"
						+ "    eine Region durch ein Shell-Kommando pipet.</li>"
						+ "<li>Du fragst ihn, ob er sich mit Computern auskennt, denn er sieht so nerdig aus.</li></ol>",
						Arrays.asList(s2, badEnd));

		return s1;
	}
}
