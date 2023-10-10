-- 問題１
-- １
SELECT a.animal_name, c.caretaker_name
FROM animal a
JOIN caretaker c ON a.caretaker_id = c.caretaker_id;

-- ２
SELECT a.animal_name, e.enclosure_name
FROM animal a
JOIN enclosure e ON a.enclosure_id = e.enclosure_id;

-- ３
SELECT e.enclosure_name, COUNT(a.animal_id) AS animal_count
FROM enclosure e
JOIN animal a ON e.enclosure_id = a.enclosure_id
GROUP BY e.enclosure_name;

-- ４
SELECT c.caretaker_name, COUNT(a.animal_id) AS animal_count
FROM caretaker c
JOIN animal a ON c.caretaker_id = a.caretaker_id
GROUP BY c.caretaker_name;

-- ５
SELECT e.enclosure_name, COUNT(a.animal_id) AS animal_count
FROM enclosure e
JOIN animal a ON e.enclosure_id = a.enclosure_id
GROUP BY e.enclosure_name;

-- 問題２
-- １
SELECT plants.name, heights.height
FROM plants
JOIN heights ON plants.id = heights.plant_id
WHERE heights.height >= 10;

-- ２
SELECT plants.name, origins.country
FROM plants
JOIN origins ON plants.id = origins.plant_id
WHERE origins.country = '日本';

-- ３
SELECT plants.name, pests.pest_name
FROM plants
JOIN pests ON plants.id = pests.plant_id
WHERE pests.pest_name <> 'アブラムシ';

-- ４
SELECT plants.name, waterings.date
FROM plants
JOIN waterings ON plants.id = waterings.plant_id
WHERE waterings.date = (SELECT MAX(date) FROM waterings);

-- ５
SELECT plants.name, fertilizers.fertilizer_name, fertilizers.amount
FROM plants
JOIN fertilizers ON plants.id = fertilizers.plant_id
WHERE fertilizers.amount >= 100;

-- 問題３
-- １
SELECT buildings.name, COUNT(floors.floor_number) AS floor_count
FROM buildings
JOIN floors ON buildings.id = floors.building_id
GROUP BY buildings.name
HAVING COUNT(floors.floor_number) >= 5;

-- ２
SELECT buildings.name, tenants.tenant_name
FROM buildings
JOIN tenants ON buildings.id = tenants.building_id
WHERE tenants.tenant_name LIKE 'ABC社%';

-- ３
SELECT buildings.name, amenities.amenity_name
FROM buildings
JOIN amenities ON buildings.id = amenities.building_id
WHERE amenities.amenity_name <> 'プール';

-- ４
SELECT buildings.name, AVG(rentals.rental_fee) AS average_rental_fee
FROM buildings
JOIN rentals ON buildings.id = rentals.building_id
GROUP BY buildings.name;

-- ５
SELECT buildings.name, maintenance.maintenance_date
FROM buildings
JOIN maintenance ON buildings.id = maintenance.building_id
WHERE maintenance.maintenance_date = (SELECT MAX(maintenance_date) FROM maintenance);
