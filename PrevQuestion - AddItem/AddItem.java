@ParametersAreNonnullByDefault // Checks for null pointers in the paramters of the function
public static void addOrDropItem(Player player, ItemStack... itemStacks) { // Player that the items should be added to and an array of ItemStacks objects to be added to that player
    final HashMap<Integer, ItemStack> remaining = player.getInventory().addItem(itemStacks); // final = constant hashmap = kv dictionary 
    if (remaining.size() > 0) { // If there are values in the dictionary(If there are items to still add)
        for (ItemStack itemStack : remaining.values()) { // For every remaining item stack that could not be added to the inventory
            player.getWorld().dropItemNaturally(player.getLocation(), itemStack); // Drop the item stack on the ground at the player's location
        }
    }
}
