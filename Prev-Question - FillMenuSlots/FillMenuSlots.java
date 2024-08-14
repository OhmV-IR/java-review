public static void fillMenuSlots(ChestMenu chestMenu, int[] slots, ItemStack itemStack) { // Chest menu to fill, int array of the positions you want to fill, and the items you want to fill them with
    for (int slot : slots) { // For every slot that needs to be filled
        chestMenu.addItem(slot, itemStack, ChestMenuUtils.getEmptyClickHandler()); // Add the item to the chest menu with an empty click handler
    }
}