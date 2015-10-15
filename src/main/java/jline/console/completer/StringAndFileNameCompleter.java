package jline.console.completer;

import java.util.ArrayList;
import java.util.List;

/**
 * Completer for a set of strings as well as filenames
 *
 * @author mattsun
 * @since 2.3
 */
public class StringAndFileNameCompleter implements Completer {
	StringsCompleter stringCompleter;
	FileNameCompleter fileNameCompleter;
	
	public StringAndFileNameCompleter(StringsCompleter stringCompleter,
			FileNameCompleter fileNameCompleter) {
		this.stringCompleter = stringCompleter;
		this.fileNameCompleter = fileNameCompleter;
	}
	
	public int complete(String buffer, int cursor, List<CharSequence> candidates) {
		stringCompleter.complete(buffer, cursor, candidates);
		fileNameCompleter.complete(buffer, cursor, candidates);

		return candidates.isEmpty() ? -1 : 0;
	}

}
