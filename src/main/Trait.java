package main;

public class Trait extends SpecialRule {
	
	Trait(String name, String description){
		super(name, description);
	}
	
	@Override
	public Trait withParameter(String parameter) {
		Trait ruleWithParameter = new Trait(name, description);
		ruleWithParameter.setParameter(parameter);
		return ruleWithParameter;
	}
	
	// Basic Physiology //
	public static final Trait arms = new Trait("Arms",
			"You have @ arms.");
	public static final Trait  beastial= new Trait("Beastial",
			"You don't need to make any Tests to survive in your natural habitat. Unless starving or desperate, you make a Willpower Test when frightened, startled or injured and flee if you fail.");
	public static final Trait crawler = new Trait("Crawler",
			"You cannot Run, but are not affected by difficult terrain.");
	public static final Trait darkSight = new Trait("Dark-Sight",
			"You take no penalties due to Darkness.");
	public static final Trait fast = new Trait("Fast",
			"You get a +@ bonus to your base movement.");
	public static final Trait flight = new Trait("Flight",
			"You can fly. Your Agility Bonus counts as @ while flying.");
	public static final Trait hover = new Trait("Hover",
			"You can hover a short distance above the ground, and can Move @ meters while doing so.");
	public static final Trait legs = new Trait("Legs",
			"You have @ legs.");
	public static final Trait limbless = new Trait("Limbless",
			"You have no arms or legs.");
	public static final Trait machine = new Trait("Machine",
			"You do not breathe and are immune to vacuum, cold and anything which affects the mind.");
	public static final Trait size = new Trait("Size",
			"You are affected by the bonuses/penalties for size @. Your Maximum Wounds is @.");
	public static final Trait size_2 = new Trait("Size 2",
			"You get a -50 bonus for size. Your Maximum Wounds is 2.") {
		@Override
		protected void onAdd(NPC npc) {
			npc.setSize(2);
		}
	};
	public static final Trait slow = new Trait("Slow",
			"You get a -@ penalty to your base movement.");
	public static final Trait sonarSense = new Trait("Sonar Sense",
			"You can see up to @ meters using sonar. Other characters can Notice this.");
	public static final Trait unnaturalSenses = new Trait("Unnatural Senses",
			"You can perceive your surroundings up to @ meters away using means other than sight or sound.");
	
	// Physiology / Critical Damage //
	public static final Trait lostHand = new Trait("Lost Hand",
			"Take a -20 penalty to any Test which would typically involve 2 hands, or where you have strapped an item to your hand in place of holding it.");
	public static final Trait lostArm = new Trait("Lost Arm",
			"Take a -20 penalty to any Test which would typically involve 2 hands.");
	public static final Trait lostFoot = new Trait("Lost Foot",
			"Take a -10 penalty to any Agility Test involving the use of legs. You become Prone on critical failures.");
	public static final Trait lostLeg = new Trait("Lost Leg",
			"Take a -10 penalty to any Agility Test involving the use of legs. Fall Prone on critical failures. Walking requires an Agility Test.");
	public static final Trait lostEye = new Trait("Lost Eye",
			"Take a -10 penalty to any Test which would typically involve vision.");
	public static final Trait blind = new Trait("Blind",
			"Take a -30 penalty to any Test which would typically involve vision and automatically fail any Test which relies on it.");
	public static final Trait deaf = new Trait("Deaf",
			"Take a -30 penalty to any Test which would typically involve hearing and automatically fail any Test which relies on it.");
	public static final Trait mute = new Trait("Mute",
			"Take a -30 penalty to any Test which would typically involve speaking and automatically fail any Test which relies on it.");
	
	// Daemons //
	public static final Trait daemonic = new Trait("Daemonic",
			"You are immune to disease, poison, vacuum, becoming Stunned or Bleeding Out, the effects of Psychic Phenomena and anything which affects the mind, such as Fear and Insanity. You halve your Toughness against force weapons, psychic powers, holy attacks or other Daemonic characters.");
	public static final Trait daemonicPresence = new Trait("Daemonic Presence",
			"All non-daemonic characters within @ meters take a -10 penalty to Willpower Tests.");
	public static final Trait incoprorial = new Trait("Incoprorial",
			"Get a +30 bonus to Conceal yourself and to Sneak. You can pass though solid objects, but cannot pass through Gellar fields. You can only harm or be harmed by Daemons, psychic powers, Warp creatures, other Incorporeal characters and force weapons.");
	public static final Trait phase = new Trait("Phase",
			"Secondary Action; Gain or remove the Incorporeal Trait.");
	public static final Trait stuffOfNightmares = new Trait("Stuff of Nightmares",
			"You are immune to all non-fatal effects of Critical damage, unless caused by force weapons, psychic powers, holy attacks or other Daemonic characters.");
	public static final Trait warpInstability = new Trait("Warp Instability",
			"If you take any wounds, make a Willpower Test on your next turn. On failure, take 1 additional wound. On critical failure, you are cast back into the warp.");
	public static final Trait warpWeapons = new Trait("Warp Weapons",
			"Your unarmed attacks ignore physical armour.");
	
	// Other //
	public static final Trait amorphous = new Trait("Amorphous",
			"You can pass through areas which are smaller than your Size would normally allow.");
	public static final Trait armoured = new Trait("Armoured",
			"Get a +@ bonus to Armour Points.");
	public static final Trait burrower = new Trait("Burrower",
			"You can Move through earth @ meters.");
	public static final Trait fearRating = new Trait("Fear Rating",
			"When a character encounters you, they take a Fear Test.");
	public static final Trait fearless = new Trait("Fearless",
			"You are immune to Fear Tests from Fear Rating @ and below.");
	public static final Trait programmedBehaviour = new Trait("Programmed Behaviour",
			"You are immune to all social Tests. If you are faced with a situation outside your programming, you must pass an Intelligence Test in order to act.");
	public static final Trait regeneration = new Trait("Regeneration",
			"You recover @ Wounds each turn.");
	public static final Trait sturdy = new Trait("Sturdy",
			"Get a +20 bonus to oppose Knock Down and becoming Grappled.");
	public static final Trait toxic = new Trait("Toxic",
			"When a character wounds you with a melee attack, they become Poisoned.");
	public static final Trait undying = new Trait("Undying",
			"You are unaffected by disease, poison and vacuum.");
	
}