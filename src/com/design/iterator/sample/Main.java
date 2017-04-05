package com.design.iterator.sample;

public class Main {

	public static void main(String[] args) {
		
		IPackageManager<String> packageManager = new PackageManager<String>();
		packageManager.add("com.design.bridge");
		packageManager.add("com.design.adapter");
		packageManager.add("com.design.composite");
		packageManager.add("com.design.decorate");
		packageManager.add("com.design.facade");
		packageManager.add("com.design.flyweight");
		packageManager.add("com.design.iterator");
		packageManager.add("com.design.mediator");
		packageManager.add("com.design.proxy");
		packageManager.add("com.design.tempaltor");
		packageManager.add("com.design.visitor");
		packageManager.add("com.design.observer");
		
		Iterator<String> iterator = packageManager.iterator();
		iterator.moveToFirst();
		while(iterator.hasNext()) {
			String t = iterator.next();
			System.out.println(t);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Iterator<String> revserIterator = packageManager.reverseIterator();
		revserIterator.moveToFirst();
		while(revserIterator.hasNext()) {
			String t = revserIterator.next();
			System.out.println(t);
		}
	}

}
