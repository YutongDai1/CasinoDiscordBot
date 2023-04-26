package edu.northeastern.cs5500.starterbot.command;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class CommandModule {

    @Provides
    @IntoSet
    public SlashCommandHandler providePlayerInfoCommand(PlayerInfoCommand playerInfoCommand) {
        return playerInfoCommand;
    }

    @Provides
    @IntoSet
    public SlashCommandHandler provideSetNameCommand(SetUserNameCommand setUserNameCommand) {
        return setUserNameCommand;
    }

    @Provides
    @IntoSet
    public SlashCommandHandler provideGameSlashCommand(GameCommand gameCommand) {
        return gameCommand;
    }

    @Provides
    @IntoSet
    public ButtonHandler provideGameButtonCommand(GameCommand gameCommand) {
        return gameCommand;
    }

    @Provides
    @IntoSet
    public ModalHandler provideGameModalCommand(GameCommand gameCommand) {
        return gameCommand;
    }

    @Provides
    @IntoSet
    public ButtonHandler provideBlackjackCommand(BlackjackCommand blackjackCommand) {
        return blackjackCommand;
    }

    @Provides
    @IntoSet
    public ButtonHandler provideSlotMachineCommand(SlotMachineCommand slotMachineCommand) {
        return slotMachineCommand;
    }
}
