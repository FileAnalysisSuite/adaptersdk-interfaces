package io.github.fileanalysissuite.adaptersdk.interfaces.framework;

import java.util.Optional;

public interface OptionsProvider {

    /**
     * Retrieves available option names.
     * @return the option names.
     */
    Iterable<String> getOptionNames();

    /**
     * Retrieves a value of an option.
     * <p>
     * If the option does not exist, <c>null</c> will be returned.
     * @param optionName the option name.
     * @return the value of an option
     */
    Optional<String> getOption(String optionName);
}
